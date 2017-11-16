package com.tencent.mm.plugin.product.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;

public class MallProductSelectAmountView
  extends LinearLayout
{
  TextView hqk;
  private ImageView nJV;
  private ImageView nJW;
  int nJX;
  int nJY;
  private int nJZ;
  int nKa;
  a nKb;
  
  public MallProductSelectAmountView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6005706457088L, 44746);
    this.hqk = null;
    this.nJV = null;
    this.nJW = null;
    this.nJX = Integer.MAX_VALUE;
    this.nJY = 1;
    this.nJZ = 1;
    this.nKa = this.nJZ;
    this.nKb = null;
    paramContext = ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(a.g.sNY, this, true);
    this.hqk = ((TextView)paramContext.findViewById(a.f.sBF));
    this.nJV = ((ImageView)paramContext.findViewById(a.f.sBE));
    this.nJW = ((ImageView)paramContext.findViewById(a.f.sBK));
    this.hqk.setText(this.nKa);
    this.nJV.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6029462994944L, 44923);
        if (MallProductSelectAmountView.a(MallProductSelectAmountView.this) + 1 > MallProductSelectAmountView.b(MallProductSelectAmountView.this))
        {
          if (MallProductSelectAmountView.c(MallProductSelectAmountView.this) != null) {
            MallProductSelectAmountView.c(MallProductSelectAmountView.this).cM(MallProductSelectAmountView.a(MallProductSelectAmountView.this), MallProductSelectAmountView.d(MallProductSelectAmountView.this));
          }
          GMTrace.o(6029462994944L, 44923);
          return;
        }
        MallProductSelectAmountView.e(MallProductSelectAmountView.this);
        if (MallProductSelectAmountView.f(MallProductSelectAmountView.this)) {
          MallProductSelectAmountView.g(MallProductSelectAmountView.this).setText(MallProductSelectAmountView.a(MallProductSelectAmountView.this));
        }
        if (MallProductSelectAmountView.c(MallProductSelectAmountView.this) != null) {
          MallProductSelectAmountView.c(MallProductSelectAmountView.this).dd(MallProductSelectAmountView.a(MallProductSelectAmountView.this));
        }
        GMTrace.o(6029462994944L, 44923);
      }
    });
    this.nJW.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6005169586176L, 44742);
        if (MallProductSelectAmountView.a(MallProductSelectAmountView.this) - 1 < MallProductSelectAmountView.h(MallProductSelectAmountView.this))
        {
          if (MallProductSelectAmountView.c(MallProductSelectAmountView.this) != null) {
            MallProductSelectAmountView.c(MallProductSelectAmountView.this).cM(MallProductSelectAmountView.a(MallProductSelectAmountView.this), 2);
          }
          GMTrace.o(6005169586176L, 44742);
          return;
        }
        MallProductSelectAmountView.i(MallProductSelectAmountView.this);
        if (MallProductSelectAmountView.f(MallProductSelectAmountView.this)) {
          MallProductSelectAmountView.g(MallProductSelectAmountView.this).setText(MallProductSelectAmountView.a(MallProductSelectAmountView.this));
        }
        MallProductSelectAmountView.f(MallProductSelectAmountView.this);
        if (MallProductSelectAmountView.c(MallProductSelectAmountView.this) != null) {
          MallProductSelectAmountView.c(MallProductSelectAmountView.this).dd(MallProductSelectAmountView.a(MallProductSelectAmountView.this));
        }
        GMTrace.o(6005169586176L, 44742);
      }
    });
    GMTrace.o(6005706457088L, 44746);
  }
  
  final boolean aXy()
  {
    GMTrace.i(6005840674816L, 44747);
    if (this.nKa > this.nJX)
    {
      this.nKa = this.nJX;
      if (this.nKb != null) {
        this.nKb.dd(this.nKa);
      }
      if (this.nKb != null) {
        this.nKb.cM(this.nKa, this.nJY);
      }
      this.hqk.setText(this.nKa);
      GMTrace.o(6005840674816L, 44747);
      return false;
    }
    if (this.nKa > this.nJZ) {
      this.nJW.setEnabled(true);
    }
    for (;;)
    {
      GMTrace.o(6005840674816L, 44747);
      return true;
      if (this.nKa != this.nJZ) {
        break;
      }
      this.nJW.setEnabled(false);
    }
    this.nJW.setEnabled(false);
    this.nKa = this.nJZ;
    if (this.nKb != null) {
      this.nKb.dd(this.nKa);
    }
    if (this.nKb != null) {
      this.nKb.cM(this.nKa, 2);
    }
    this.hqk.setText(this.nKa);
    GMTrace.o(6005840674816L, 44747);
    return false;
  }
  
  public static abstract interface a
  {
    public abstract void cM(int paramInt1, int paramInt2);
    
    public abstract void dd(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\ui\MallProductSelectAmountView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */