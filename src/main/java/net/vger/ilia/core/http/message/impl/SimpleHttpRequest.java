package net.vger.ilia.core.http.message.impl;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import net.vger.ilia.core.HttpRequestMethod;
import net.vger.ilia.core.http.message.AbstractHttpMessage;
import net.vger.ilia.core.http.message.HttpRequest;
import net.vger.ilia.core.http.message.component.QueryParameter;

public class SimpleHttpRequest extends AbstractHttpMessage implements HttpRequest {

	private URL url;
	private Integer port;
	private HttpRequestMethod httpRequestMethod;
	private List<QueryParameter> queryParameters;

	@Override
	public URL getUrl() {
		return url;
	}

	@Override
	public void setUrl(URL url) {
		this.url = url;
	}

	@Override
	public Integer getPort() {
		return port;
	}
	
	@Override
	public void setPort(Integer port) {
		this.port = port;
	}
	
	@Override
	public HttpRequestMethod getHttpRequestMethod() {
		return httpRequestMethod;
	}

	@Override
	public void setHttpRequestMethod(HttpRequestMethod httpRequestType) {
		this.httpRequestMethod = httpRequestType;
	}
	
	@Override
	public List<QueryParameter> getQueryParameters() {
		if (this.queryParameters == null) {
			this.queryParameters = new ArrayList<QueryParameter>();
		}
		return this.queryParameters;
	}

	@Override
	public void setQueryParameters(List<QueryParameter> queryParameters) {
		this.queryParameters = queryParameters;
	}

	@Override
	public void addQueryParameter(QueryParameter queryParameter) {
		getQueryParameters().add(queryParameter);
	}

	@Override
	public void addQueryParameters(List<QueryParameter> queryParameters) {
		getQueryParameters().addAll(queryParameters);
	}

	@Override
	public void removeQueryParameter(QueryParameter queryParameter) {
		getQueryParameters().remove(queryParameter);
	}

	@Override
	public void removeQueryParameters(List<QueryParameter> queryParameters) {
		getQueryParameters().removeAll(queryParameters);
	}

	@Override
	public void clearQueryParameters() {
		this.queryParameters = null;
	}

}