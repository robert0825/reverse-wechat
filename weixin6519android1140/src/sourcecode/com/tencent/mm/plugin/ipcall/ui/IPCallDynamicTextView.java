package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class IPCallDynamicTextView
  extends TextView
{
  private ae mHandler;
  private int mHeight;
  private String mValue;
  private double mpT;
  private double mpU;
  private double mpV;
  private boolean mpW;
  private int mpX;
  private int mpY;
  DecimalFormat mpZ;
  private String mqa;
  private String mqb;
  
  public IPCallDynamicTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11688350842880L, 87085);
    this.mpX = 4000;
    this.mpY = 50;
    this.mpZ = new DecimalFormat("0.00");
    this.mqa = "";
    this.mqb = "";
    this.mHandler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(11650098790400L, 86800);
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(11650098790400L, 86800);
          return;
          if (((IPCallDynamicTextView.a(IPCallDynamicTextView.this) > 0.0D) && (IPCallDynamicTextView.b(IPCallDynamicTextView.this) < IPCallDynamicTextView.c(IPCallDynamicTextView.this))) || ((IPCallDynamicTextView.a(IPCallDynamicTextView.this) < 0.0D) && (IPCallDynamicTextView.b(IPCallDynamicTextView.this) > IPCallDynamicTextView.c(IPCallDynamicTextView.this))))
          {
            IPCallDynamicTextView.a(IPCallDynamicTextView.this, true);
            IPCallDynamicTextView.a(IPCallDynamicTextView.this, IPCallDynamicTextView.b(IPCallDynamicTextView.this));
            IPCallDynamicTextView.b(IPCallDynamicTextView.this, IPCallDynamicTextView.b(IPCallDynamicTextView.this) + IPCallDynamicTextView.a(IPCallDynamicTextView.this));
            IPCallDynamicTextView.e(IPCallDynamicTextView.this).sendEmptyMessageDelayed(1, IPCallDynamicTextView.d(IPCallDynamicTextView.this));
            GMTrace.o(11650098790400L, 86800);
            return;
          }
          IPCallDynamicTextView.a(IPCallDynamicTextView.this, false);
          IPCallDynamicTextView.a(IPCallDynamicTextView.this, IPCallDynamicTextView.c(IPCallDynamicTextView.this));
        }
      }
    };
    init();
    GMTrace.o(11688350842880L, 87085);
  }
  
  public IPCallDynamicTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(11688485060608L, 87086);
    this.mpX = 4000;
    this.mpY = 50;
    this.mpZ = new DecimalFormat("0.00");
    this.mqa = "";
    this.mqb = "";
    this.mHandler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(11650098790400L, 86800);
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(11650098790400L, 86800);
          return;
          if (((IPCallDynamicTextView.a(IPCallDynamicTextView.this) > 0.0D) && (IPCallDynamicTextView.b(IPCallDynamicTextView.this) < IPCallDynamicTextView.c(IPCallDynamicTextView.this))) || ((IPCallDynamicTextView.a(IPCallDynamicTextView.this) < 0.0D) && (IPCallDynamicTextView.b(IPCallDynamicTextView.this) > IPCallDynamicTextView.c(IPCallDynamicTextView.this))))
          {
            IPCallDynamicTextView.a(IPCallDynamicTextView.this, true);
            IPCallDynamicTextView.a(IPCallDynamicTextView.this, IPCallDynamicTextView.b(IPCallDynamicTextView.this));
            IPCallDynamicTextView.b(IPCallDynamicTextView.this, IPCallDynamicTextView.b(IPCallDynamicTextView.this) + IPCallDynamicTextView.a(IPCallDynamicTextView.this));
            IPCallDynamicTextView.e(IPCallDynamicTextView.this).sendEmptyMessageDelayed(1, IPCallDynamicTextView.d(IPCallDynamicTextView.this));
            GMTrace.o(11650098790400L, 86800);
            return;
          }
          IPCallDynamicTextView.a(IPCallDynamicTextView.this, false);
          IPCallDynamicTextView.a(IPCallDynamicTextView.this, IPCallDynamicTextView.c(IPCallDynamicTextView.this));
        }
      }
    };
    init();
    GMTrace.o(11688485060608L, 87086);
  }
  
  public static String Az(String paramString)
  {
    GMTrace.i(11688887713792L, 87089);
    String str1 = "";
    int i = 0;
    while ((i < paramString.length()) && (!Character.isDigit(paramString.charAt(i))))
    {
      str1 = str1 + paramString.charAt(i);
      i += 1;
    }
    String str2 = "";
    i = paramString.length() - 1;
    while ((i > 0) && (!Character.isDigit(paramString.charAt(i))))
    {
      str2 = str2 + paramString.charAt(i);
      i -= 1;
    }
    paramString = paramString.substring(str1.length(), paramString.length() - str2.length());
    GMTrace.o(11688887713792L, 87089);
    return paramString;
  }
  
  private void init()
  {
    GMTrace.i(11688619278336L, 87087);
    getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
    {
      public final void onGlobalLayout()
      {
        GMTrace.i(11634663751680L, 86685);
        if (IPCallDynamicTextView.b(IPCallDynamicTextView.this) != IPCallDynamicTextView.c(IPCallDynamicTextView.this)) {
          IPCallDynamicTextView.e(IPCallDynamicTextView.this).sendEmptyMessage(1);
        }
        GMTrace.o(11634663751680L, 86685);
      }
    });
    GMTrace.o(11688619278336L, 87087);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(11689021931520L, 87090);
    super.onMeasure(paramInt1, paramInt2);
    this.mHeight = getMeasuredHeight();
    GMTrace.o(11689021931520L, 87090);
  }
  
  public final void setValue(String paramString1, String paramString2)
  {
    GMTrace.i(11688753496064L, 87088);
    if ((paramString1 == null) || (paramString1.length() <= 0) || (paramString2 == null) || (paramString2.length() <= 0))
    {
      setText(paramString2);
      GMTrace.o(11688753496064L, 87088);
      return;
    }
    try
    {
      this.mpU = Double.parseDouble(Az(paramString1));
      this.mqa = "";
      i = 0;
      while ((i < paramString2.length()) && (!Character.isDigit(paramString2.charAt(i))))
      {
        this.mqa += paramString2.charAt(i);
        i += 1;
      }
      this.mqb = "";
    }
    catch (NumberFormatException paramString1)
    {
      setText(paramString2);
      GMTrace.o(11688753496064L, 87088);
      return;
    }
    int i = paramString2.length() - 1;
    while ((i > 0) && (!Character.isDigit(paramString2.charAt(i))))
    {
      this.mqb += paramString2.charAt(i);
      i -= 1;
    }
    paramString1 = paramString2.substring(this.mqa.length(), paramString2.length() - this.mqb.length());
    try
    {
      this.mpV = Double.parseDouble(paramString1);
      this.mValue = paramString2;
      this.mpT = ((this.mpV - this.mpU) / (this.mpX / this.mpY));
      if (this.mpT == 0.0D)
      {
        setText(paramString2);
        GMTrace.o(11688753496064L, 87088);
        return;
      }
    }
    catch (NumberFormatException paramString1)
    {
      setText(paramString2);
      GMTrace.o(11688753496064L, 87088);
      return;
    }
    this.mpT = new BigDecimal(this.mpT).setScale(2, 4).doubleValue();
    if (isShown()) {
      this.mHandler.sendEmptyMessage(1);
    }
    GMTrace.o(11688753496064L, 87088);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\ui\IPCallDynamicTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */