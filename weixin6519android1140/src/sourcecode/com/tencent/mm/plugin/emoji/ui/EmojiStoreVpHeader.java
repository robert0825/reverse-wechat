package com.tencent.mm.plugin.emoji.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.e;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.emoji.a.i;
import com.tencent.mm.plugin.emoji.model.a;
import com.tencent.mm.protocal.c.qw;
import com.tencent.mm.protocal.c.qx;
import com.tencent.mm.protocal.c.qy;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MMDotView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class EmojiStoreVpHeader
  extends LinearLayout
  implements ViewPager.e
{
  private MMDotView iPE;
  private View jBw;
  private View kgo;
  private ViewPager kqK;
  private LinkedList<a> kqL;
  private i kqM;
  private float kqN;
  private float kqO;
  private a kqP;
  private volatile boolean kqQ;
  private final int kqR;
  private final int kqS;
  
  public EmojiStoreVpHeader(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(11416828379136L, 85062);
    this.kqR = 5;
    this.kqS = 0;
    setOrientation(1);
    GMTrace.o(11416828379136L, 85062);
  }
  
  public EmojiStoreVpHeader(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11416962596864L, 85063);
    this.kqR = 5;
    this.kqS = 0;
    setOrientation(1);
    GMTrace.o(11416962596864L, 85063);
  }
  
  public static int[] aO(Context paramContext)
  {
    GMTrace.i(11417096814592L, 85064);
    int[] arrayOfInt = new int[2];
    if ((paramContext instanceof Activity))
    {
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      ((Activity)paramContext).getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
      arrayOfInt[0] = localDisplayMetrics.widthPixels;
      arrayOfInt[1] = localDisplayMetrics.heightPixels;
    }
    for (;;)
    {
      GMTrace.o(11417096814592L, 85064);
      return arrayOfInt;
      paramContext = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
      arrayOfInt[0] = paramContext.getWidth();
      arrayOfInt[1] = paramContext.getHeight();
    }
  }
  
  private void asN()
  {
    try
    {
      GMTrace.i(11417231032320L, 85065);
      if (this.kqL == null) {
        throw new IllegalAccessError("must has emoji baner list first");
      }
    }
    finally {}
    int i;
    if (this.jBw == null)
    {
      this.jBw = inflate(getContext(), R.i.cve, null);
      this.kgo = this.jBw.findViewById(R.h.bwg);
      this.iPE = ((MMDotView)this.jBw.findViewById(R.h.bwf));
      this.kqK = ((ViewPager)this.jBw.findViewById(R.h.bwh));
      this.kqP = new a();
      i = aO(getContext())[0] * 3 / 8;
      if (this.kgo != null) {
        this.kgo.setLayoutParams(new LinearLayout.LayoutParams(-1, i + 1));
      }
      addView(this.jBw, new LinearLayout.LayoutParams(-1, -2));
    }
    Object localObject2;
    if (this.iPE != null)
    {
      localObject2 = this.iPE;
      if (this.kqL == null)
      {
        i = 0;
        ((MMDotView)localObject2).BU(i);
        this.iPE.BV(0);
        this.iPE.setVisibility(8);
      }
    }
    else
    {
      if ((this.kqK != null) && (this.kqL != null)) {
        break label251;
      }
      GMTrace.o(11417231032320L, 85065);
    }
    for (;;)
    {
      return;
      i = this.kqL.size();
      break;
      label251:
      if (this.kqL.size() <= 0)
      {
        if (this.kgo != null) {
          this.kgo.setVisibility(8);
        }
        GMTrace.o(11417231032320L, 85065);
      }
      else
      {
        if (this.kgo != null) {
          this.kgo.setVisibility(0);
        }
        this.kqK.yr = this;
        if (this.kqM == null)
        {
          this.kqM = new i(getContext(), this.kqL);
          this.kqK.a(this.kqM);
          localObject2 = this.kqK;
          if (1 != ((ViewPager)localObject2).xZ)
          {
            ((ViewPager)localObject2).xZ = 1;
            ((ViewPager)localObject2).populate();
          }
          asO();
          GMTrace.o(11417231032320L, 85065);
        }
        else
        {
          post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(11463536148480L, 85410);
              if ((EmojiStoreVpHeader.a(EmojiStoreVpHeader.this) != null) && (EmojiStoreVpHeader.b(EmojiStoreVpHeader.this) != null)) {
                EmojiStoreVpHeader.a(EmojiStoreVpHeader.this).I(EmojiStoreVpHeader.b(EmojiStoreVpHeader.this));
              }
              GMTrace.o(11463536148480L, 85410);
            }
          });
          GMTrace.o(11417231032320L, 85065);
        }
      }
    }
  }
  
  private void asO()
  {
    GMTrace.i(11417365250048L, 85066);
    if (this.kqK == null)
    {
      GMTrace.o(11417365250048L, 85066);
      return;
    }
    this.kqK.c(i.khe / 2 * this.kqL.size(), false);
    GMTrace.o(11417365250048L, 85066);
  }
  
  private void dS(boolean paramBoolean)
  {
    GMTrace.i(11418573209600L, 85075);
    ViewParent localViewParent = getParent();
    if (localViewParent != null) {
      localViewParent.requestDisallowInterceptTouchEvent(paramBoolean);
    }
    GMTrace.o(11418573209600L, 85075);
  }
  
  public final void V(int paramInt)
  {
    GMTrace.i(11418304774144L, 85073);
    if ((this.kqL == null) || (this.kqL.size() <= 1))
    {
      GMTrace.o(11418304774144L, 85073);
      return;
    }
    if ((paramInt == 0) || (paramInt == this.kqM.getCount() - 1)) {
      this.jBw.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(11404346130432L, 84969);
          EmojiStoreVpHeader.c(EmojiStoreVpHeader.this);
          GMTrace.o(11404346130432L, 84969);
        }
      }, 350L);
    }
    GMTrace.o(11418304774144L, 85073);
  }
  
  public final void W(int paramInt)
  {
    GMTrace.i(11418036338688L, 85071);
    GMTrace.o(11418036338688L, 85071);
  }
  
  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
    GMTrace.i(11418170556416L, 85072);
    GMTrace.o(11418170556416L, 85072);
  }
  
  public final void asP()
  {
    GMTrace.i(11417499467776L, 85067);
    if (this.kqP == null) {
      this.kqP = new a();
    }
    this.kqQ = true;
    this.kqP.removeMessages(0);
    this.kqP.sendEmptyMessageDelayed(0, 5000L);
    GMTrace.o(11417499467776L, 85067);
  }
  
  public final void asQ()
  {
    GMTrace.i(11417633685504L, 85068);
    if (this.kqP == null)
    {
      GMTrace.o(11417633685504L, 85068);
      return;
    }
    this.kqQ = false;
    this.kqP.removeMessages(0);
    GMTrace.o(11417633685504L, 85068);
  }
  
  public final void c(LinkedList<qw> paramLinkedList, LinkedList<qy> paramLinkedList1)
  {
    GMTrace.i(11417902120960L, 85070);
    if (paramLinkedList == null)
    {
      GMTrace.o(11417902120960L, 85070);
      return;
    }
    if (this.kqL == null) {
      this.kqL = new LinkedList();
    }
    for (;;)
    {
      paramLinkedList1 = paramLinkedList1.iterator();
      while (paramLinkedList1.hasNext())
      {
        qy localqy = (qy)paramLinkedList1.next();
        if ((localqy != null) && (localqy.ugT != null) && (!bg.nm(localqy.ugT.ugU))) {
          this.kqL.add(new a(null, localqy, true));
        }
      }
      this.kqL.clear();
    }
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      paramLinkedList1 = (qw)paramLinkedList.next();
      if ((paramLinkedList1 != null) && (paramLinkedList1.ugT != null) && (!bg.nm(paramLinkedList1.ugT.ugU))) {
        this.kqL.add(new a(paramLinkedList1, null, false));
      }
    }
    asN();
    GMTrace.o(11417902120960L, 85070);
  }
  
  public final void clear()
  {
    GMTrace.i(11417767903232L, 85069);
    if (this.kqM != null)
    {
      i locali = this.kqM;
      if (locali.khd != null) {
        locali.khd.clear();
      }
      if (locali.khh != null) {
        locali.khh.clear();
      }
      locali.khg = true;
      this.kqM = null;
    }
    this.kqP = null;
    GMTrace.o(11417767903232L, 85069);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(11418438991872L, 85074);
    int i = paramMotionEvent.getAction();
    int j = paramMotionEvent.getAction();
    float f1 = paramMotionEvent.getRawX();
    float f2 = paramMotionEvent.getRawY();
    switch (j)
    {
    default: 
      switch (i)
      {
      }
      break;
    }
    for (;;)
    {
      boolean bool = super.onInterceptTouchEvent(paramMotionEvent);
      GMTrace.o(11418438991872L, 85074);
      return bool;
      this.kqN = f1;
      this.kqO = f2;
      break;
      j = (int)(f1 - this.kqN);
      int k = (int)(f2 - this.kqO);
      if (Math.abs(j) <= Math.abs(k)) {
        break;
      }
      dS(true);
      break;
      this.kqN = 0.0F;
      this.kqO = 0.0F;
      dS(false);
      break;
      asQ();
      continue;
      asP();
    }
  }
  
  private final class a
    extends ae
  {
    public a()
    {
      GMTrace.i(11390655922176L, 84867);
      GMTrace.o(11390655922176L, 84867);
    }
    
    public final void handleMessage(Message paramMessage)
    {
      GMTrace.i(11390790139904L, 84868);
      if ((!EmojiStoreVpHeader.d(EmojiStoreVpHeader.this)) && (paramMessage.what != 0))
      {
        GMTrace.o(11390790139904L, 84868);
        return;
      }
      if ((EmojiStoreVpHeader.b(EmojiStoreVpHeader.this) == null) || (EmojiStoreVpHeader.b(EmojiStoreVpHeader.this).size() <= 1))
      {
        w.w("MicroMsg.emoji.EmojiStoreVpHeader", "list is null");
        GMTrace.o(11390790139904L, 84868);
        return;
      }
      if (EmojiStoreVpHeader.a(EmojiStoreVpHeader.this) == null)
      {
        w.w("MicroMsg.emoji.EmojiStoreVpHeader", "adapter is null");
        GMTrace.o(11390790139904L, 84868);
        return;
      }
      int j = EmojiStoreVpHeader.e(EmojiStoreVpHeader.this).xI + 1;
      int i = j;
      if (j >= EmojiStoreVpHeader.a(EmojiStoreVpHeader.this).getCount()) {
        i = EmojiStoreVpHeader.b(EmojiStoreVpHeader.this).size() * i.khe / 2;
      }
      EmojiStoreVpHeader.e(EmojiStoreVpHeader.this).Y(i);
      if ((EmojiStoreVpHeader.d(EmojiStoreVpHeader.this)) && (EmojiStoreVpHeader.f(EmojiStoreVpHeader.this) != null)) {
        sendMessageDelayed(EmojiStoreVpHeader.f(EmojiStoreVpHeader.this).obtainMessage(0), 5000L);
      }
      GMTrace.o(11390790139904L, 84868);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\EmojiStoreVpHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */