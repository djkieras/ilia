package net.vger.ilia.http.message;

import java.util.List;

import net.vger.ilia.http.message.component.HttpHeader;

public interface HttpMessage {

	List<HttpHeader> getHttpHeaders();
	
	void setHttpHeaders(List<HttpHeader> httpHeaders);
	
	void addHttpHeader(HttpHeader header);

	void addHttpHeaders(List<HttpHeader> headers);
	
	void removeHttpHeader(HttpHeader header);
	
	void removeHttpHeaders(List<HttpHeader> headers);
	
	void clearHttpHeaders();

}
