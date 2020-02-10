package com.charlie.util;

import java.util.concurrent.TimeUnit;

import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class RedissonUtil {

	@Autowired
	private RedissonClient redissonClient;

	/**
	 * 开启redisson的lock锁
	 * 
	 * @param lockKey
	 * @return 返回一个实例的锁
	 */
	public RLock lock(String lockKey) {
		RLock lock = redissonClient.getLock(lockKey);
		lock.lock();
		return lock;
	}

	/**
	 * 开启一个带有失效时间的lock锁，单位为秒(TimeUnit.SECONDS)
	 * 
	 * @param lockKey
	 * @param timeout 为加锁时间
	 * @return
	 */
	public RLock lock(String lockKey, long timeout) {
		RLock lock = redissonClient.getLock(lockKey);
		lock.lock(timeout, TimeUnit.SECONDS);
		return lock;
	}

	/**
	 * timeout为加锁时间，时间单位由unit确定
	 * 
	 * @param lockKey
	 * @param unit
	 * @param timeout
	 * @return
	 */
	public RLock lock(String lockKey, TimeUnit unit, long timeout) {
		RLock lock = redissonClient.getLock(lockKey);
		lock.lock(timeout, unit);
		return lock;
	}

	/**
	 * tryLock()，马上返回，拿到lock就返回true，不然返回false。带时间限制的tryLock()，拿不到lock，就等一段时间，超时返回false
	 * 
	 * @param lockKey
	 * @param unit
	 * @param waitTime 没拿到锁的时候，等待的时间(自旋时间)
	 * @param timeout  失效时间
	 * @return 成功拿到锁返回true，出现异常就返回false
	 */
	public boolean tryLock(String lockKey, TimeUnit unit, long timeout, long waitTime) {
		RLock lock = redissonClient.getLock(lockKey);
		try {
			/**
			 * 如果成功拿到锁，那么默认返回成功
			 */
			return lock.tryLock(waitTime, timeout, unit);
		} catch (InterruptedException e) {
			return false;
		}
	}

	/**
	 * 传入一个key，释放锁资源
	 * 
	 * @param lockKey
	 */
	public void unlock(String lockKey) {
		RLock lock = redissonClient.getLock(lockKey);
		lock.unlock();
	}

	/**
	 * 传入一个RLock对象，释放锁资源
	 * 
	 * @param lock
	 */

	public void unlock(RLock lock) {
		lock.unlock();
	}
}
