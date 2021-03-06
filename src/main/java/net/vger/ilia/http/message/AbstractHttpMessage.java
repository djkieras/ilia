package net.vger.ilia.http.message;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.http.client.utils.CloneUtils;

import net.vger.ilia.http.message.component.HttpHeader;

public class AbstractHttpMessage implements HttpMessage, Cloneable {

	private List<HttpHeader> httpHeaders;
	private String body;
	
	@Override
	public List<HttpHeader> getHttpHeaders() {
		if (this.httpHeaders == null) {
			this.httpHeaders = new ArrayList<HttpHeader>();
		}
		return this.httpHeaders;
	}

	@Override
	public void setHttpHeaders(List<HttpHeader> httpHeaders) {
		this.httpHeaders = httpHeaders;
	}

	@Override
	public void addHttpHeader(HttpHeader httpHeader) {
		getHttpHeaders().add(httpHeader);
	}

	@Override
	public void addHttpHeaders(List<HttpHeader> httpHeaders) {
		getHttpHeaders().addAll(httpHeaders);
	}

	@Override
	public void removeHttpHeader(HttpHeader httpHeader) {
		getHttpHeaders().remove(httpHeader);
	}

	@Override
	public void removeHttpHeaders(List<HttpHeader> httpHeaders) {
		getHttpHeaders().removeAll(httpHeaders);
	}

	@Override
	public void clearHttpHeaders() {
		this.httpHeaders = null;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return CloneUtils.cloneObject(this);
	}
	
}
