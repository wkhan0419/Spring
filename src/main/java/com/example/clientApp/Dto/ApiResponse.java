package com.example.clientApp.Dto;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * This class is used for common api response
 * 
 * @author j519
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse {

	Object dataBean;
	String message;
	String result;
	int httpCode;
	Object error;

	/**
	 * This function is used for return api response with dto, status OK, message
	 * and result
	 * 
	 * @param dataBean
	 * @param message
	 * @param result
	 * @return
	 */
	public static ApiResponse toOkResponse(Object dataBean, String message, String result) {

		return toApiResponse(dataBean, HttpStatus.OK.value(), message, result);
	}

	/**
	 * This function is used for return api response with dto, status, message and
	 * result
	 * 
	 * @param dataBean
	 * @param message
	 * @param result
	 * @return
	 */
	public static ApiResponse toOkResponse(Object dataBean, String message, String result, int httpCode) {

		return toApiResponse(dataBean, httpCode, message, result);
	}

	/**
	 * This function is used for return api response with dto, status NO_CONTENT,
	 * message and result
	 * 
	 * @param dataBean
	 * @param message
	 * @param result
	 * @return
	 */
	public static ApiResponse toNoContentResponse(Object dataBean, String message, String result) {

		return toApiResponse(dataBean, HttpStatus.NO_CONTENT.value(), message, result);
	}

	/**
	 * This function is used for return api response with dto, status NOT_FOUND,
	 * message and result
	 * 
	 * @param dataBean
	 * @param message
	 * @param result
	 * @return
	 */
	public static ApiResponse toNotFoundResponse(Object dataBean, String message, String result) {

		return toApiResponse(dataBean, HttpStatus.NOT_FOUND.value(), message, result);
	}

	/**
	 * This function is used for return api response with dto, status BAD_REQUEST,
	 * message and result
	 * 
	 * @param dataBean
	 * @param message
	 * @param result
	 * @return
	 */
	public static ApiResponse toBadRequestResponse(Object dataBean, String message, String result) {

		return toApiResponse(dataBean, HttpStatus.BAD_REQUEST.value(), message, result);
	}

	/**
	 * This function is used for return api response with dto
	 * 
	 * @param dataBean
	 * @param httpCode
	 * @param message
	 * @param result
	 * @return
	 */
	public static ApiResponse toApiResponse(Object dataBean, int httpCode, String message, String result) {
		ApiResponse response = new ApiResponse();
		response.setDataBean(dataBean);
		response.setHttpCode(httpCode);
		response.setMessage(message);
		response.setResult(result);

		return response;
	}

	/**
	 * This function is used for return api error response with dto
	 * 
	 * @param dataBean
	 * @param httpCode
	 * @param message
	 * @param result
	 * @return
	 */
	public static ApiResponse toErrorResponse(Object dataBean, HttpStatus httpCode, String message, String result) {
		ApiResponse response = new ApiResponse();
		response.setError(dataBean);
		response.setHttpCode(httpCode.value());
		response.setMessage(message);
		response.setResult(result);

		return response;
	}

	public Object getDataBean() {
		return dataBean;
	}

	public void setDataBean(Object dataBean) {
		this.dataBean = dataBean;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public int getHttpCode() {
		return httpCode;
	}

	public void setHttpCode(int httpCode) {
		this.httpCode = httpCode;
	}

	public Object getError() {
		return error;
	}

	public void setError(Object error) {
		this.error = error;
	}

	@Override
	public String toString() {
		return "ApiResponse [dataBean=" + dataBean + ", message=" + message + ", result=" + result + ", httpCode="
				+ httpCode + ", error=" + error + "]";
	}

}
