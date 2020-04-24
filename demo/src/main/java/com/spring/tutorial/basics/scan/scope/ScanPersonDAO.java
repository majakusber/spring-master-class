package com.spring.tutorial.basics.scan.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ScanPersonDAO {

  @Autowired
  ScanJdbcConnection scanJdbcConnection;

  public ScanJdbcConnection getScanJdbcConnection() {
    return scanJdbcConnection;
  }

  public void setScanJdbcConnection(ScanJdbcConnection scanJdbcConnection) {
    this.scanJdbcConnection = scanJdbcConnection;
  }
}
