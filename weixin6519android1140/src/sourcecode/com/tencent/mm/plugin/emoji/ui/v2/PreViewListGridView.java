package com.tencent.mm.plugin.emoji.ui.v2;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.Display;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.pluginsdk.ui.emoji.PopEmojiView;
import com.tencent.mm.sdk.platformtools.ae;

public class PreViewListGridView
  extends ListView
{
  private int QU;
  private WindowManager kqV;
  private boolean kvh;
  private WindowManager.LayoutParams kvn;
  private int kvo;
  private int kvp;
  private int kvq;
  private boolean kvr;
  private volatile int kvs;
  private String kvt;
  private PopEmojiView kvu;
  private d kvv;
  private ae mHandler;
  
  public PreViewListGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11511183441920L, 85765);
    this.kvh = true;
    this.mHandler = new ae();
    this.kvs = -1;
    init(paramContext);
    GMTrace.o(11511183441920L, 85765);
  }
  
  public PreViewListGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(11511317659648L, 85766);
    this.kvh = true;
    this.mHandler = new ae();
    this.kvs = -1;
    init(paramContext);
    GMTrace.o(11511317659648L, 85766);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(11511451877376L, 85767);
    this.kvu = new PopEmojiView(getContext());
    this.kvo = paramContext.getResources().getDimensionPixelSize(R.f.aRZ);
    this.kqV = ((WindowManager)paramContext.getSystemService("window"));
    this.kvn = new WindowManager.LayoutParams(-1, -1, 2, 8, 1);
    this.kvn.width = this.kvo;
    this.kvn.height = this.kvo;
    this.kvn.gravity = 17;
    this.QU = getResources().getConfiguration().orientation;
    if (this.QU == 2)
    {
      this.kvp = this.kqV.getDefaultDisplay().getHeight();
      this.kvq = this.kqV.getDefaultDisplay().getWidth();
      GMTrace.o(11511451877376L, 85767);
      return;
    }
    this.kvp = this.kqV.getDefaultDisplay().getWidth();
    this.kvq = this.kqV.getDefaultDisplay().getHeight();
    GMTrace.o(11511451877376L, 85767);
  }
  
  public final void ath()
  {
    GMTrace.i(11511854530560L, 85770);
    if (this.kvr)
    {
      this.kqV.removeView(this.kvu);
      this.kvr = false;
    }
    this.kvt = "";
    GMTrace.o(11511854530560L, 85770);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(11511720312832L, 85769);
    switch (paramMotionEvent.getAction())
    {
    }
    do
    {
      boolean bool = super.onInterceptTouchEvent(paramMotionEvent);
      GMTrace.o(11511720312832L, 85769);
      return bool;
    } while (!this.kvr);
    ath();
    GMTrace.o(11511720312832L, 85769);
    return true;
  }
  
  public void setAdapter(ListAdapter paramListAdapter)
  {
    GMTrace.i(11511586095104L, 85768);
    super.setAdapter(paramListAdapter);
    this.kvv = ((d)paramListAdapter);
    GMTrace.o(11511586095104L, 85768);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\v2\PreViewListGridView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */