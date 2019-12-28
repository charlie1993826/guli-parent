package com.charlie.result;

/**
 * 整个项目的Ajax请求都使用这个类转换的JSON格式作为响应数据。 这样整个项目的Ajax响应就有了统一规范。
 * 
 * @author charlie
 *
 * @param <T>
 */
public class ResultEntity<T> {

	public static final String SUCCESS = "SUCCESS";
	public static final String FAILED = "FAILED";
	public static final String NO_MESSAGE = "NO_MESSAGE";
	public static final String NO_DATA = "NO_DATA";

	private String result;
	private String message;
	private T data;

	/**
	 * 操作成功，但是没有数据返回的情况
	 * 
	 * @return
	 */
	public static ResultEntity<String> successWithoutData() {
		return new ResultEntity<>(SUCCESS, NO_MESSAGE, NO_DATA);
	}

	/**
	 * 操作成功，需要返回数据的情况
	 * 
	 * @param data
	 * @return
	 */
	public static <T> ResultEntity<T> successWithData(T data) {
		return new ResultEntity<>(SUCCESS, NO_MESSAGE, data);
	}

	/**
	 * 操作失败的情况
	 * 
	 * @param message
	 * @return
	 */
	public static <T> ResultEntity<T> failed(String message) {
		return new ResultEntity<T>(FAILED, message, null);
	}

	public ResultEntity() {
		// TODO Auto-generated constructor stub
	}

	public ResultEntity(String result, String message, T data) {
		super();
		this.result = result;
		this.message = message;
		this.data = data;
	}

	@Override
	public String toString() {
		return "ResultEntity [result=" + result + ", message=" + message + ", data=" + data + "]";
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
