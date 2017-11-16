package com.tencent.mm.ui.base;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.w;

public class MMFalseProgressBar
  extends ProgressBar
{
  private ae mHandler;
  private boolean mIsStart;
  private float wbA;
  private float wbB;
  private float wbC;
  public boolean wbD;
  private float wby;
  private float wbz;
  
  public MMFalseProgressBar(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(20288083329024L, 151158);
    bZH();
    GMTrace.o(20288083329024L, 151158);
  }
  
  public MMFalseProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(3280281272320L, 24440);
    GMTrace.o(3280281272320L, 24440);
  }
  
  public MMFalseProgressBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3280415490048L, 24441);
    this.mIsStart = false;
    this.wby = 0.0F;
    this.wbD = true;
    this.mHandler = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(3331686662144L, 24823);
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(3331686662144L, 24823);
          return;
          MMFalseProgressBar.a(MMFalseProgressBar.this);
          GMTrace.o(3331686662144L, 24823);
          return;
          MMFalseProgressBar.b(MMFalseProgressBar.this);
          GMTrace.o(3331686662144L, 24823);
          return;
          MMFalseProgressBar.c(MMFalseProgressBar.this);
          GMTrace.o(3331686662144L, 24823);
          return;
          MMFalseProgressBar.d(MMFalseProgressBar.this);
        }
      }
    };
    setMax(1000);
    bZH();
    GMTrace.o(3280415490048L, 24441);
  }
  
  private void bZH()
  {
    GMTrace.i(3280818143232L, 24444);
    if (am.ex(ab.getContext()))
    {
      this.wbz = 4.0F;
      this.wbA = 1.0F;
      this.wbB = 0.3F;
      this.wbC = 50.0F;
      GMTrace.o(3280818143232L, 24444);
      return;
    }
    this.wbz = 2.0F;
    this.wbA = 0.5F;
    this.wbB = 0.15F;
    this.wbC = 50.0F;
    GMTrace.o(3280818143232L, 24444);
  }
  
  public final void finish()
  {
    GMTrace.i(3280683925504L, 24443);
    w.d("MicroMsg.MMFalseProgressBar", "[cpan] finish");
    if (this.mHandler != null) {
      this.mHandler.sendEmptyMessage(1002);
    }
    GMTrace.o(3280683925504L, 24443);
  }
  
  public final void start()
  {
    GMTrace.i(3280549707776L, 24442);
    w.d("MicroMsg.MMFalseProgressBar", "[cpan] start");
    if (!this.wbD)
    {
      GMTrace.o(3280549707776L, 24442);
      return;
    }
    if (this.mIsStart)
    {
      GMTrace.o(3280549707776L, 24442);
      return;
    }
    this.mIsStart = true;
    bZH();
    if (this.mHandler != null)
    {
      this.mHandler.sendEmptyMessage(1000);
      this.mHandler.sendEmptyMessage(1001);
    }
    GMTrace.o(3280549707776L, 24442);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ui\base\MMFalseProgressBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */