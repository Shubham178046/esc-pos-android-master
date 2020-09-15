package com.leerybit.escpos;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;

import com.leerybit.escpos.bluetooth.BTService;
import com.leerybit.escpos.bluetooth.SearchPrinterDialog;

import org.apache.commons.lang3.ArrayUtils;

import java.util.List;
public class PosPrinter80mm extends PosPrinter {

  public PosPrinter80mm(Activity activity) {
    super(activity);
  }

  @Override
  int getCharsOnLine() {
    return 48;
  }
}
