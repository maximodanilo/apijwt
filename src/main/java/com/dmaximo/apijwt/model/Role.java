package com.dmaximo.apijwt.model;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
  ROLE_SELECT, ROLE_INSERT, ROLE_UPDATE, ROLE_DELETE, ROLE_ADMIN;

  public String getAuthority() {
    return name();
  }

}
