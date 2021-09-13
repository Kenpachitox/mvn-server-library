package org.example.http.framework;

import lombok.Builder;
import lombok.Value;

import java.util.Map;

@Value
@Builder
public class Request {
  String method;
  String path;
  Map<String, String> query;
  Map<String, String> headers;
  Map<String, String> form;
  @Builder.Default
  byte[] body = new byte[]{};

}
