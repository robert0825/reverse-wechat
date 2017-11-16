package com.tencent.mm.plugin.wenote.model.nativenote.c;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.ClipboardManager;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.wenote.model.a.h;
import com.tencent.mm.plugin.wenote.model.a.k;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public final class e
  implements a.a
{
  public static boolean mHasInit;
  public static volatile e sgf;
  public ae mHandler;
  public int mScreenHeight;
  public int mScreenWidth;
  public d sgA;
  public b sgB;
  public aj sgC;
  public aj sgD;
  public TextView sgE;
  public TextView sgF;
  public TextView sgG;
  public TextView sgH;
  public TextView sgI;
  public TextView sgJ;
  public TextView sgK;
  public TextView sgL;
  public boolean sgg;
  public int sgh;
  public int sgi;
  public int sgj;
  public int sgk;
  public int sgl;
  public int sgm;
  public int sgn;
  public int sgo;
  public int sgp;
  public int sgq;
  public int[] sgr;
  public int[] sgs;
  public int[] sgt;
  public int[] sgu;
  public PopupWindow sgv;
  public PopupWindow sgw;
  public PopupWindow sgx;
  public PopupWindow sgy;
  public com.tencent.mm.plugin.wenote.model.nativenote.b.a sgz;
  
  static
  {
    GMTrace.i(20616782544896L, 153607);
    sgf = null;
    mHasInit = false;
    GMTrace.o(20616782544896L, 153607);
  }
  
  private e()
  {
    GMTrace.i(20611011182592L, 153564);
    this.sgg = true;
    this.sgh = 0;
    this.sgi = 0;
    this.sgj = 14;
    this.sgk = 0;
    this.sgl = 0;
    this.sgm = 0;
    this.sgn = 0;
    this.sgo = 0;
    this.mScreenHeight = 0;
    this.mScreenWidth = 0;
    this.sgp = 0;
    this.sgq = 0;
    this.sgr = null;
    this.sgs = null;
    this.sgt = null;
    this.sgu = null;
    this.sgv = null;
    this.sgw = null;
    this.sgx = null;
    this.sgy = null;
    this.sgz = null;
    this.sgA = null;
    this.sgB = null;
    this.sgC = null;
    this.sgD = null;
    this.mHandler = null;
    this.sgE = null;
    this.sgF = null;
    this.sgG = null;
    this.sgH = null;
    this.sgI = null;
    this.sgJ = null;
    this.sgK = null;
    this.sgL = null;
    mHasInit = false;
    GMTrace.o(20611011182592L, 153564);
  }
  
  private void T(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(20612353359872L, 153574);
    if (!mHasInit)
    {
      GMTrace.o(20612353359872L, 153574);
      return;
    }
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(20612353359872L, 153574);
      return;
      if ((this.sgs != null) && (this.sgs.length == 2))
      {
        this.sgs[0] = paramInt2;
        this.sgs[1] = paramInt3;
        GMTrace.o(20612353359872L, 153574);
        return;
        if ((this.sgt != null) && (this.sgt.length == 2))
        {
          this.sgt[0] = paramInt2;
          this.sgt[1] = paramInt3;
          GMTrace.o(20612353359872L, 153574);
          return;
          if ((this.sgu != null) && (this.sgu.length == 2))
          {
            this.sgu[0] = paramInt2;
            this.sgu[1] = paramInt3;
          }
        }
      }
    }
  }
  
  private int U(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(20615037714432L, 153594);
    if (!mHasInit)
    {
      GMTrace.o(20615037714432L, 153594);
      return 0;
    }
    boolean bool;
    switch (paramInt1)
    {
    default: 
      GMTrace.o(20615037714432L, 153594);
      return 0;
    case 2: 
      bool = r(paramInt2, paramInt3, paramInt2, paramInt3);
    }
    while (bool)
    {
      GMTrace.o(20615037714432L, 153594);
      return 3;
      if ((this.sgA == null) || (paramInt2 > this.sgA.endPos) || ((paramInt2 == this.sgA.endPos) && (paramInt3 >= this.sgA.sge)))
      {
        GMTrace.o(20615037714432L, 153594);
        return 1;
      }
      bool = r(paramInt2, paramInt3, this.sgA.endPos, this.sgA.sge);
      continue;
      if ((this.sgA == null) || (paramInt2 < this.sgA.gsM) || ((paramInt2 == this.sgA.gsM) && (paramInt3 <= this.sgA.startOffset)))
      {
        GMTrace.o(20615037714432L, 153594);
        return 1;
      }
      bool = r(this.sgA.gsM, this.sgA.startOffset, paramInt2, paramInt3);
    }
    GMTrace.o(20615037714432L, 153594);
    return 2;
  }
  
  private static SpannableStringBuilder a(h paramh, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, String paramString, boolean paramBoolean3)
  {
    GMTrace.i(20616379891712L, 153604);
    if (paramh == null)
    {
      w.e("NoteSelectManager", "processTextDataItem: textDataItem is null");
      GMTrace.o(20616379891712L, 153604);
      return null;
    }
    Object localObject = com.tencent.mm.plugin.wenote.model.nativenote.a.a.NF(paramh.content);
    if (localObject == null)
    {
      w.e("NoteSelectManager", "processTextDataItem: spannedText is null");
      GMTrace.o(20616379891712L, 153604);
      return null;
    }
    if (paramBoolean1) {
      paramInt2 = ((Spanned)localObject).length();
    }
    for (;;)
    {
      String str = paramString;
      if (paramString == null) {
        str = "";
      }
      if ((paramInt1 < 0) || (paramInt1 > ((Spanned)localObject).length()) || (paramInt2 < 0) || (paramInt2 > ((Spanned)localObject).length()) || (paramInt1 > paramInt2))
      {
        w.e("NoteSelectManager", "processTextDataItem: incorrect offset");
        GMTrace.o(20616379891712L, 153604);
        return null;
      }
      paramString = (SpannableStringBuilder)((Spanned)localObject).subSequence(0, paramInt1);
      SpannableStringBuilder localSpannableStringBuilder = (SpannableStringBuilder)((Spanned)localObject).subSequence(paramInt1, paramInt2);
      localObject = (SpannableStringBuilder)((Spanned)localObject).subSequence(paramInt2, ((Spanned)localObject).length());
      paramInt1 = paramInt2;
      if (paramBoolean2)
      {
        paramInt2 = paramString.length();
        paramInt1 = paramInt2;
        if (!bg.nm(str))
        {
          Spanned localSpanned = com.tencent.mm.plugin.wenote.model.nativenote.a.a.NF(str);
          paramInt1 = paramInt2;
          if (localSpanned != null) {
            paramInt1 = paramInt2 + localSpanned.length();
          }
        }
        paramh.content = (com.tencent.mm.plugin.wenote.model.nativenote.a.b.a(paramString) + str + com.tencent.mm.plugin.wenote.model.nativenote.a.b.a((Spanned)localObject));
      }
      if (paramBoolean3) {
        paramh.scH = true;
      }
      for (paramh.scJ = paramInt1;; paramh.scJ = -1)
      {
        GMTrace.o(20616379891712L, 153604);
        return localSpannableStringBuilder;
        paramh.scH = false;
      }
    }
  }
  
  private void a(int paramInt1, RecyclerView paramRecyclerView, View paramView, int paramInt2)
  {
    GMTrace.i(20614366625792L, 153589);
    if ((!mHasInit) || (paramRecyclerView == null))
    {
      GMTrace.o(20614366625792L, 153589);
      return;
    }
    paramView = f.cQ(paramView);
    if (paramView == null)
    {
      yG(paramInt1);
      GMTrace.o(20614366625792L, 153589);
      return;
    }
    if (paramView.sgb != null) {
      paramView = paramView.sgb;
    }
    for (;;)
    {
      if (paramView == null)
      {
        yG(paramInt1);
        GMTrace.o(20614366625792L, 153589);
        return;
        if ((paramView.sgc != null) && (paramView.sgd != null))
        {
          if (paramInt2 == 0)
          {
            paramView = paramView.sgc;
            paramInt2 = 0;
            continue;
          }
          if (paramInt2 == 1)
          {
            paramView = paramView.sgd;
            paramInt2 = 0;
          }
        }
      }
      else
      {
        Object localObject = paramView.getText();
        if ((localObject == null) || (paramInt2 < 0) || (paramInt2 > ((Editable)localObject).length()))
        {
          yG(paramInt1);
          GMTrace.o(20614366625792L, 153589);
          return;
        }
        localObject = paramView.getLayout();
        if (localObject == null)
        {
          yG(paramInt1);
          GMTrace.o(20614366625792L, 153589);
          return;
        }
        float f4 = ((Layout)localObject).getPrimaryHorizontal(paramInt2) + paramView.getPaddingLeft();
        int i = paramView.getPaddingTop();
        float f3 = ((Layout)localObject).getLineTop(((Layout)localObject).getLineForOffset(paramInt2)) + i;
        float f1 = f4;
        float f2 = f3;
        boolean bool;
        if (paramView.seM != 0)
        {
          f3 = f3 + paramView.getHeight() - this.sgh;
          if (paramInt1 == 3)
          {
            f1 = f4 + this.sgq;
            f2 = f3;
          }
        }
        else
        {
          localObject = new int[2];
          paramView.getLocationOnScreen((int[])localObject);
          switch (paramInt1)
          {
          default: 
            bool = false;
          }
        }
        for (;;)
        {
          if (!bool) {
            yG(paramInt1);
          }
          GMTrace.o(20614366625792L, 153589);
          return;
          f1 = f4;
          f2 = f3;
          if (paramInt1 != 4) {
            break;
          }
          f1 = f4 - this.sgq;
          f2 = f3;
          break;
          bool = a(2, paramRecyclerView, this.sgv, (int)(f1 + localObject[0] - this.sgp), (int)(localObject[1] + f2));
          continue;
          bool = a(3, paramRecyclerView, this.sgw, (int)(f1 + localObject[0] - this.sgw.getWidth()), (int)(localObject[1] + f2));
          continue;
          bool = a(4, paramRecyclerView, this.sgx, (int)(f1 + localObject[0]), (int)(localObject[1] + f2));
        }
      }
      paramView = null;
    }
  }
  
  private boolean a(int paramInt1, RecyclerView paramRecyclerView, PopupWindow paramPopupWindow, int paramInt2, int paramInt3)
  {
    GMTrace.i(20614500843520L, 153590);
    if ((!mHasInit) || (paramRecyclerView == null) || (paramPopupWindow == null))
    {
      GMTrace.o(20614500843520L, 153590);
      return false;
    }
    if ((paramInt3 < D(paramRecyclerView)) || (paramInt3 > this.mScreenHeight - bIc()))
    {
      GMTrace.o(20614500843520L, 153590);
      return false;
    }
    if (paramPopupWindow.isShowing())
    {
      paramPopupWindow.update(paramInt2, paramInt3, -1, -1, false);
      T(paramInt1, paramInt2, paramInt3);
      if (paramInt1 == 2)
      {
        if (this.sgD != null) {
          break label172;
        }
        this.sgD = new aj(new aj.a()
        {
          public final boolean pM()
          {
            GMTrace.i(20617319415808L, 153611);
            if ((e.this.bIa() == 1) && (e.this.yG(2))) {
              e.this.bIh();
            }
            GMTrace.o(20617319415808L, 153611);
            return true;
          }
        }, false);
      }
    }
    for (;;)
    {
      this.sgD.z(3000L, 0L);
      GMTrace.o(20614500843520L, 153590);
      return true;
      paramPopupWindow.showAtLocation(paramRecyclerView, 0, paramInt2, paramInt3);
      T(paramInt1, paramInt2, paramInt3);
      break;
      label172:
      this.sgD.stopTimer();
    }
  }
  
  public static e bIb()
  {
    GMTrace.i(20611145400320L, 153565);
    if (sgf == null) {}
    try
    {
      if (sgf == null) {
        sgf = new e();
      }
      e locale = sgf;
      GMTrace.o(20611145400320L, 153565);
      return locale;
    }
    finally {}
  }
  
  private int bIc()
  {
    GMTrace.i(20611682271232L, 153569);
    if (this.sgz != null)
    {
      int i = this.sgz.bHf();
      int j = this.sgz.bHg();
      GMTrace.o(20611682271232L, 153569);
      return i + j;
    }
    GMTrace.o(20611682271232L, 153569);
    return 0;
  }
  
  private void bIk()
  {
    GMTrace.i(20615171932160L, 153595);
    if (this.sgB == null)
    {
      this.sgB = new b();
      GMTrace.o(20615171932160L, 153595);
      return;
    }
    this.sgB.reset();
    GMTrace.o(20615171932160L, 153595);
  }
  
  private void bIl()
  {
    GMTrace.i(20615306149888L, 153596);
    if (this.sgC == null)
    {
      this.sgC = new aj(new aj.a()
      {
        public final boolean pM()
        {
          GMTrace.i(20609400569856L, 153552);
          w.d("NoteSelectManager", "onTimerExpired: ");
          RecyclerView localRecyclerView = e.this.blo();
          int i;
          int j;
          if ((e.this.sgB != null) && (e.this.sgB.sfU < e.this.D(localRecyclerView)))
          {
            i = 1;
            if ((e.this.sgB == null) || (e.this.sgB.sfU <= e.this.bIm())) {
              break label212;
            }
            j = 1;
            label92:
            if ((!e.mHasInit) || (localRecyclerView == null) || (e.this.sgB == null) || (e.this.sgB.getType() != 1) || ((i == 0) && (j == 0))) {
              break label262;
            }
            if ((i == 0) || (!localRecyclerView.canScrollVertically(-1))) {
              break label217;
            }
            if (e.this.sgB.jHw == 3) {
              e.this.bIe();
            }
            e.this.jT(false);
            e.this.bIj();
            e.this.bIh();
            localRecyclerView.smoothScrollBy(0, 65236);
          }
          for (;;)
          {
            GMTrace.o(20609400569856L, 153552);
            return true;
            i = 0;
            break;
            label212:
            j = 0;
            break label92;
            label217:
            if ((j != 0) && (localRecyclerView.canScrollVertically(1)))
            {
              e.this.jT(false);
              e.this.bIj();
              e.this.bIh();
              localRecyclerView.smoothScrollBy(0, 300);
              continue;
              label262:
              if (e.this.sgC != null) {
                e.this.sgC.stopTimer();
              }
            }
          }
        }
      }, true);
      GMTrace.o(20615306149888L, 153596);
      return;
    }
    this.sgC.stopTimer();
    GMTrace.o(20615306149888L, 153596);
  }
  
  public static void d(TextView paramTextView, int paramInt)
  {
    GMTrace.i(20615708803072L, 153599);
    if (paramTextView != null) {
      paramTextView.setTextSize(1, paramInt);
    }
    GMTrace.o(20615708803072L, 153599);
  }
  
  private boolean d(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    GMTrace.i(20614635061248L, 153591);
    if ((!mHasInit) || (paramRecyclerView == null) || (this.sgy == null))
    {
      GMTrace.o(20614635061248L, 153591);
      return false;
    }
    if ((paramInt2 < D(paramRecyclerView)) || (paramInt2 > this.mScreenHeight - bIc()))
    {
      GMTrace.o(20614635061248L, 153591);
      return false;
    }
    if (this.sgy.isShowing()) {
      this.sgy.update(paramInt1, paramInt2, -1, -1, false);
    }
    for (;;)
    {
      GMTrace.o(20614635061248L, 153591);
      return true;
      this.sgy.showAtLocation(paramRecyclerView, 0, paramInt1, paramInt2);
    }
  }
  
  public static boolean isEnabled()
  {
    GMTrace.i(20611279618048L, 153566);
    boolean bool = mHasInit;
    GMTrace.o(20611279618048L, 153566);
    return bool;
  }
  
  private static boolean k(View paramView, boolean paramBoolean)
  {
    GMTrace.i(20616648327168L, 153606);
    if (paramView == null)
    {
      GMTrace.o(20616648327168L, 153606);
      return false;
    }
    if (paramBoolean)
    {
      paramView.setVisibility(0);
      GMTrace.o(20616648327168L, 153606);
      return true;
    }
    paramView.setVisibility(8);
    GMTrace.o(20616648327168L, 153606);
    return false;
  }
  
  private static boolean n(int[] paramArrayOfInt)
  {
    GMTrace.i(20612487577600L, 153575);
    if ((mHasInit) && (paramArrayOfInt != null) && (paramArrayOfInt.length == 2) && (paramArrayOfInt[0] != -1) && (paramArrayOfInt[1] != -1))
    {
      GMTrace.o(20612487577600L, 153575);
      return true;
    }
    GMTrace.o(20612487577600L, 153575);
    return false;
  }
  
  public final int D(RecyclerView paramRecyclerView)
  {
    GMTrace.i(20615440367616L, 153597);
    int j = 150;
    int i = j;
    if (paramRecyclerView != null)
    {
      paramRecyclerView.getLocationOnScreen(this.sgr);
      i = j;
      if (n(this.sgr)) {
        i = this.sgr[1];
      }
    }
    GMTrace.o(20615440367616L, 153597);
    return i;
  }
  
  public final void G(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(20612890230784L, 153578);
    if (!mHasInit)
    {
      GMTrace.o(20612890230784L, 153578);
      return;
    }
    bIj();
    bIh();
    e(true, 50L);
    jS(paramBoolean1);
    f(paramBoolean2, 50L);
    GMTrace.o(20612890230784L, 153578);
  }
  
  public final SpannableStringBuilder a(boolean paramBoolean, ArrayList<com.tencent.mm.plugin.wenote.model.a.b> paramArrayList, String paramString)
  {
    int i = 2;
    GMTrace.i(20616111456256L, 153602);
    d locald = bId();
    bIf();
    int j = locald.bIa();
    if ((j != 1) && (j != 2))
    {
      w.e("NoteSelectManager", "getAndProcessSelectedDataInSingleSelect: incorrect select");
      GMTrace.o(20616111456256L, 153602);
      return null;
    }
    Object localObject = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().yD(locald.gsM);
    if (localObject == null)
    {
      w.e("NoteSelectManager", "getAndProcessSelectedDataInSingleSelect: item is null");
      GMTrace.o(20616111456256L, 153602);
      return null;
    }
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    if (((com.tencent.mm.plugin.wenote.model.a.b)localObject).getType() == 1)
    {
      if ((paramBoolean) && (paramArrayList != null) && (paramArrayList.size() > 0))
      {
        paramString = a((h)localObject, locald.startOffset, locald.sge, false, false, "", true);
        com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().a(paramArrayList, 0, locald.gsM, locald.startOffset, locald.sge);
        com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().dN(locald.gsM, locald.gsM + paramArrayList.size() + 1);
        paramArrayList = paramString;
      }
      for (;;)
      {
        GMTrace.o(20616111456256L, 153602);
        return paramArrayList;
        paramString = a((h)localObject, locald.startOffset, locald.sge, false, paramBoolean, paramString, true);
        if (this.sgz != null) {
          this.sgz.yw(locald.gsM);
        }
        paramArrayList = paramString;
        if (paramBoolean)
        {
          com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().bHx();
          paramArrayList = paramString;
        }
      }
    }
    if ((j == 1) && (paramBoolean))
    {
      if (locald.startOffset == 0) {
        i = 1;
      }
      if ((paramArrayList == null) || (paramArrayList.size() <= 0)) {
        break label373;
      }
    }
    for (;;)
    {
      com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().a(paramArrayList, i, locald.gsM, locald.startOffset, locald.sge);
      paramString = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo();
      i = locald.gsM;
      j = locald.gsM;
      paramString.dN(i - 1, paramArrayList.size() + j + 1);
      paramArrayList = localSpannableStringBuilder;
      break;
      label373:
      if (bg.nm(paramString)) {
        break label425;
      }
      paramArrayList = new ArrayList();
      localObject = new h();
      ((h)localObject).content = paramString;
      ((h)localObject).scH = false;
      ((h)localObject).scJ = -1;
      paramArrayList.add(localObject);
    }
    label425:
    GMTrace.o(20616111456256L, 153602);
    return localSpannableStringBuilder;
  }
  
  public final void a(int paramInt, MotionEvent paramMotionEvent)
  {
    GMTrace.i(20614769278976L, 153592);
    if ((!mHasInit) || (this.mHandler == null))
    {
      GMTrace.o(20614769278976L, 153592);
      return;
    }
    if ((this.sgB != null) && (this.sgB.getType() == 1) && (this.sgB.jHw != paramInt))
    {
      GMTrace.o(20614769278976L, 153592);
      return;
    }
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      GMTrace.o(20614769278976L, 153592);
      return;
      bIk();
      if (!bIg()) {
        jR(true);
      }
      this.sgB.a(paramInt, paramMotionEvent.getRawX(), paramMotionEvent.getRawY(), paramMotionEvent.getX(), paramMotionEvent.getY(), 0);
      GMTrace.o(20614769278976L, 153592);
      return;
      if ((this.sgB != null) && (this.sgB.getType() == 1))
      {
        this.sgB.sfT = paramMotionEvent.getRawX();
        this.sgB.sfU = paramMotionEvent.getRawY();
        jT(true);
        GMTrace.o(20614769278976L, 153592);
        return;
        bIk();
        this.mHandler.postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(20617587851264L, 153613);
            e.this.jS(true);
            e.this.jR(true);
            GMTrace.o(20617587851264L, 153613);
          }
        }, 200L);
      }
    }
  }
  
  public final void a(View paramView1, View paramView2, View paramView3, int paramInt)
  {
    GMTrace.i(20613158666240L, 153580);
    if ((!mHasInit) || (paramView1 == null) || (paramView2 == null) || (paramView3 == null) || (this.sgA == null))
    {
      GMTrace.o(20613158666240L, 153580);
      return;
    }
    switch (yF(paramInt))
    {
    }
    do
    {
      paramView1.setVisibility(8);
      paramView2.setVisibility(4);
      paramView3.setVisibility(4);
      GMTrace.o(20613158666240L, 153580);
      return;
      paramView1.setVisibility(8);
      paramView2.setVisibility(4);
      paramView3.setVisibility(4);
      GMTrace.o(20613158666240L, 153580);
      return;
      if (this.sgA.startOffset == this.sgA.sge) {
        paramView1.setVisibility(8);
      }
      for (;;)
      {
        paramView2.setVisibility(4);
        paramView3.setVisibility(4);
        GMTrace.o(20613158666240L, 153580);
        return;
        paramView1.setVisibility(0);
      }
      paramView1.setVisibility(0);
      paramView2.setVisibility(0);
      paramView3.setVisibility(0);
      GMTrace.o(20613158666240L, 153580);
      return;
      if (this.sgA.startOffset == 0)
      {
        paramView1.setVisibility(0);
        paramView2.setVisibility(4);
        paramView3.setVisibility(0);
        GMTrace.o(20613158666240L, 153580);
        return;
      }
      paramView1.setVisibility(8);
      paramView2.setVisibility(4);
      paramView3.setVisibility(4);
      GMTrace.o(20613158666240L, 153580);
      return;
    } while (this.sgA.sge == 0);
    paramView1.setVisibility(0);
    paramView2.setVisibility(0);
    paramView3.setVisibility(4);
    GMTrace.o(20613158666240L, 153580);
  }
  
  public final ArrayList<com.tencent.mm.plugin.wenote.model.a.b> b(boolean paramBoolean, ArrayList<com.tencent.mm.plugin.wenote.model.a.b> paramArrayList, String paramString)
  {
    GMTrace.i(20616245673984L, 153603);
    d locald = bId();
    bIf();
    ArrayList localArrayList = new ArrayList();
    if (locald.bIa() != 3)
    {
      w.e("NoteSelectManager", "getAndProcessSelectedDataInMultiSelect: incorrect select");
      GMTrace.o(20616245673984L, 153603);
      return null;
    }
    int i = locald.gsM;
    int j = locald.endPos;
    if (j >= locald.gsM)
    {
      Object localObject = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().yD(j);
      SpannableStringBuilder localSpannableStringBuilder;
      h localh;
      if (localObject != null) {
        if ((j == locald.endPos) && (((com.tencent.mm.plugin.wenote.model.a.b)localObject).getType() == 1))
        {
          localObject = (h)localObject;
          localSpannableStringBuilder = a((h)localObject, 0, locald.sge, false, paramBoolean, "", false);
          if (!bg.L(localSpannableStringBuilder))
          {
            localh = new h();
            localh.content = com.tencent.mm.plugin.wenote.model.nativenote.a.b.a(localSpannableStringBuilder);
            localh.scJ = -1;
            localh.scH = false;
            localArrayList.add(localh);
          }
          if ((paramBoolean) && (bg.nm(((h)localObject).content))) {
            com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().Q(j, true);
          }
        }
      }
      for (;;)
      {
        j -= 1;
        break;
        if ((j == locald.gsM) && (((com.tencent.mm.plugin.wenote.model.a.b)localObject).getType() == 1))
        {
          localObject = (h)localObject;
          localSpannableStringBuilder = a((h)localObject, locald.startOffset, 0, true, paramBoolean, "", false);
          if (!bg.L(localSpannableStringBuilder))
          {
            localh = new h();
            localh.content = com.tencent.mm.plugin.wenote.model.nativenote.a.b.a(localSpannableStringBuilder);
            localh.scJ = -1;
            localh.scH = false;
            localArrayList.add(localh);
          }
          if ((paramBoolean) && (bg.nm(((h)localObject).content))) {
            com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().Q(j, true);
          } else {
            i += 1;
          }
        }
        else
        {
          localArrayList.add(com.tencent.mm.plugin.wenote.b.b.c((com.tencent.mm.plugin.wenote.model.a.b)localObject));
          if (paramBoolean) {
            com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().Q(j, true);
          }
        }
      }
    }
    if (paramBoolean)
    {
      j = i + 1;
      if ((paramArrayList != null) && (paramArrayList.size() > 0))
      {
        com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().a(i, paramArrayList);
        j = paramArrayList.size() + i;
        com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().dN(i - 1, j);
      }
    }
    else
    {
      Collections.reverse(localArrayList);
      GMTrace.o(20616245673984L, 153603);
      return localArrayList;
    }
    paramArrayList = new h();
    if (paramString != null) {}
    for (;;)
    {
      paramArrayList.content = paramString;
      paramArrayList.scH = false;
      paramArrayList.scJ = -1;
      com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().a(i, paramArrayList);
      break;
      paramString = "";
    }
  }
  
  public final int bIa()
  {
    GMTrace.i(20611816488960L, 153570);
    if (!mHasInit)
    {
      GMTrace.o(20611816488960L, 153570);
      return 0;
    }
    if (this.sgA == null) {
      this.sgA = new d();
    }
    int i = this.sgA.bIa();
    GMTrace.o(20611816488960L, 153570);
    return i;
  }
  
  public final d bId()
  {
    GMTrace.i(20611950706688L, 153571);
    if (!mHasInit)
    {
      locald = new d();
      GMTrace.o(20611950706688L, 153571);
      return locald;
    }
    if (this.sgA == null) {
      this.sgA = new d();
    }
    d locald = new d(this.sgA.gsM, this.sgA.startOffset, this.sgA.endPos, this.sgA.sge);
    GMTrace.o(20611950706688L, 153571);
    return locald;
  }
  
  public final void bIe()
  {
    GMTrace.i(20612621795328L, 153576);
    if (this.sgz != null) {
      this.sgz.bHe();
    }
    GMTrace.o(20612621795328L, 153576);
  }
  
  public final void bIf()
  {
    GMTrace.i(20612756013056L, 153577);
    if (!mHasInit)
    {
      GMTrace.o(20612756013056L, 153577);
      return;
    }
    r(-1, -1, -1, -1);
    e(true, 0L);
    bIj();
    bIh();
    GMTrace.o(20612756013056L, 153577);
  }
  
  public final boolean bIg()
  {
    GMTrace.i(20613292883968L, 153581);
    if ((this.sgy != null) && (this.sgy.isShowing()))
    {
      GMTrace.o(20613292883968L, 153581);
      return true;
    }
    GMTrace.o(20613292883968L, 153581);
    return false;
  }
  
  public final void bIh()
  {
    GMTrace.i(20613427101696L, 153582);
    if (this.sgy != null) {
      this.sgy.dismiss();
    }
    GMTrace.o(20613427101696L, 153582);
  }
  
  public final boolean bIi()
  {
    GMTrace.i(20613829754880L, 153585);
    if ((this.sgv != null) && (this.sgv.isShowing()))
    {
      GMTrace.o(20613829754880L, 153585);
      return true;
    }
    GMTrace.o(20613829754880L, 153585);
    return false;
  }
  
  public final void bIj()
  {
    GMTrace.i(20613963972608L, 153586);
    if (!mHasInit)
    {
      GMTrace.o(20613963972608L, 153586);
      return;
    }
    yG(2);
    yG(3);
    yG(4);
    GMTrace.o(20613963972608L, 153586);
  }
  
  public final int bIm()
  {
    GMTrace.i(20615574585344L, 153598);
    int j = 0;
    if (this.sgz != null) {
      j = this.sgz.bHf();
    }
    int i = j;
    if (j == 0)
    {
      i = j;
      if (this.sgz != null) {
        i = this.sgz.bHg();
      }
    }
    j = i;
    if (i == 0) {
      j = 150;
    }
    i = this.mScreenHeight;
    GMTrace.o(20615574585344L, 153598);
    return i - j;
  }
  
  public final void bIn()
  {
    GMTrace.i(20615843020800L, 153600);
    if (this.sgz != null) {
      this.sgz.bHd();
    }
    GMTrace.o(20615843020800L, 153600);
  }
  
  public final void bIo()
  {
    GMTrace.i(20615977238528L, 153601);
    w.i("NoteSelectManager", "deleteSelectedData");
    if (!mHasInit)
    {
      w.e("NoteSelectManager", "deleteSelectedData: not init");
      GMTrace.o(20615977238528L, 153601);
      return;
    }
    bIh();
    int i = bIa();
    if (i == 2)
    {
      a(true, null, "");
      GMTrace.o(20615977238528L, 153601);
      return;
    }
    if (i == 3)
    {
      b(true, null, "");
      GMTrace.o(20615977238528L, 153601);
      return;
    }
    w.e("NoteSelectManager", "deleteSelectedData: not in select");
    bIn();
    GMTrace.o(20615977238528L, 153601);
  }
  
  public final boolean bIp()
  {
    GMTrace.i(20616514109440L, 153605);
    if (bIa() != 3)
    {
      GMTrace.o(20616514109440L, 153605);
      return false;
    }
    int i = this.sgA.gsM;
    while (i <= this.sgA.endPos)
    {
      com.tencent.mm.plugin.wenote.model.a.b localb = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().yD(i);
      if ((localb != null) && (localb.getType() == 4) && (((k)localb).scV.booleanValue()))
      {
        GMTrace.o(20616514109440L, 153605);
        return true;
      }
      i += 1;
    }
    GMTrace.o(20616514109440L, 153605);
    return false;
  }
  
  public final RecyclerView blo()
  {
    GMTrace.i(20611548053504L, 153568);
    if (this.sgz != null)
    {
      RecyclerView localRecyclerView = this.sgz.bHi();
      GMTrace.o(20611548053504L, 153568);
      return localRecyclerView;
    }
    GMTrace.o(20611548053504L, 153568);
    return null;
  }
  
  public final void e(final boolean paramBoolean, long paramLong)
  {
    GMTrace.i(20613024448512L, 153579);
    if ((!mHasInit) || (this.mHandler == null))
    {
      GMTrace.o(20613024448512L, 153579);
      return;
    }
    this.mHandler.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20609669005312L, 153554);
        RecyclerView localRecyclerView = e.this.blo();
        if (localRecyclerView == null)
        {
          GMTrace.o(20609669005312L, 153554);
          return;
        }
        int i = 0;
        if (i < localRecyclerView.getChildCount())
        {
          Object localObject = localRecyclerView.getChildAt(i);
          c localc = f.cQ((View)localObject);
          if (localc != null)
          {
            if (localc.sgb == null) {
              break label84;
            }
            if (paramBoolean) {
              localc.sgb.postInvalidate();
            }
          }
          for (;;)
          {
            i += 1;
            break;
            label84:
            if ((localc.sgc != null) && (localc.sgd != null))
            {
              LinearLayout localLinearLayout1 = (LinearLayout)((View)localObject).findViewById(R.h.bSD);
              LinearLayout localLinearLayout2 = (LinearLayout)((View)localObject).findViewById(R.h.bSH);
              localObject = (LinearLayout)((View)localObject).findViewById(R.h.bSF);
              e.this.a(localLinearLayout1, localLinearLayout2, (View)localObject, localc.sgc.seZ);
            }
          }
        }
        GMTrace.o(20609669005312L, 153554);
      }
    }, paramLong);
    GMTrace.o(20613024448512L, 153579);
  }
  
  public final void f(final boolean paramBoolean, long paramLong)
  {
    GMTrace.i(20613561319424L, 153583);
    this.mHandler.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20618661593088L, 153621);
        e.this.jR(paramBoolean);
        GMTrace.o(20618661593088L, 153621);
      }
    }, 50L);
    GMTrace.o(20613561319424L, 153583);
  }
  
  public final boolean isEditable()
  {
    GMTrace.i(20611413835776L, 153567);
    if ((mHasInit) && (this.sgg))
    {
      GMTrace.o(20611413835776L, 153567);
      return true;
    }
    GMTrace.o(20611413835776L, 153567);
    return false;
  }
  
  public final void jR(boolean paramBoolean)
  {
    GMTrace.i(20613695537152L, 153584);
    if ((!mHasInit) || (this.sgy == null))
    {
      GMTrace.o(20613695537152L, 153584);
      return;
    }
    RecyclerView localRecyclerView = blo();
    int i = bIa();
    if ((localRecyclerView == null) || (i == 0) || ((i == 1) && (!paramBoolean)) || ((this.sgB != null) && (this.sgB.getType() == 1)))
    {
      bIh();
      GMTrace.o(20613695537152L, 153584);
      return;
    }
    boolean bool1 = k(this.sgE, false);
    boolean bool2 = k(this.sgF, false);
    Object localObject1 = this.sgG;
    Object localObject2;
    com.tencent.mm.plugin.wenote.model.a.b localb;
    if (bIa() == 1)
    {
      localObject2 = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().yD(this.sgA.gsM);
      if ((localObject2 != null) && ((com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().size() > 1) || (((com.tencent.mm.plugin.wenote.model.a.b)localObject2).getType() != 1) || (!bg.nm(((h)localObject2).content))))
      {
        paramBoolean = true;
        boolean bool3 = k((View)localObject1, paramBoolean);
        localObject1 = this.sgH;
        i = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().bHy();
        j = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().bHz();
        localObject2 = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().yD(i);
        localb = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().yD(j);
        if ((localObject2 != null) && (localb != null)) {
          break label433;
        }
        paramBoolean = false;
        label240:
        boolean bool4 = k((View)localObject1, paramBoolean);
        localObject1 = this.sgI;
        if (this.sgg) {
          break label556;
        }
        paramBoolean = false;
        label263:
        boolean bool5 = k((View)localObject1, paramBoolean);
        localObject1 = this.sgJ;
        i = bIa();
        if ((!this.sgg) || ((i != 2) && (i != 3))) {
          break label606;
        }
        paramBoolean = true;
        label301:
        boolean bool6 = k((View)localObject1, paramBoolean);
        localObject1 = this.sgK;
        i = bIa();
        if ((i != 2) && (i != 3)) {
          break label611;
        }
        paramBoolean = true;
        label332:
        boolean bool7 = k((View)localObject1, paramBoolean);
        localObject1 = this.sgL;
        if ((this.sgg) && (bIa() != 0)) {
          break label616;
        }
        paramBoolean = false;
        label362:
        paramBoolean = k((View)localObject1, paramBoolean);
        if ((!bool1) && (!bool2) && (!bool3) && (!bool4) && (!bool5) && (!bool6) && (!bool7) && (!paramBoolean)) {
          break label636;
        }
      }
    }
    label433:
    label551:
    label556:
    label606:
    label611:
    label616:
    label636:
    for (i = 1;; i = 0)
    {
      if (i != 0) {
        break label641;
      }
      bIh();
      GMTrace.o(20613695537152L, 153584);
      return;
      paramBoolean = false;
      break;
      if ((this.sgA != null) && (this.sgA.gsM == i) && (this.sgA.startOffset == 0) && (this.sgA.endPos == j))
      {
        if (localb.getType() == 1)
        {
          localObject2 = com.tencent.mm.plugin.wenote.model.nativenote.a.a.NF(((h)localb).content);
          if (localObject2 == null)
          {
            paramBoolean = false;
            break label240;
          }
          if (this.sgA.sge != ((Spanned)localObject2).length()) {
            break label551;
          }
          paramBoolean = false;
          break label240;
        }
        if ((localb.getType() != 1) && (this.sgA.sge == 1))
        {
          paramBoolean = false;
          break label240;
        }
      }
      paramBoolean = true;
      break label240;
      i = bIa();
      if ((i == 0) || (i == 1))
      {
        paramBoolean = false;
        break label263;
      }
      paramBoolean = true;
      if (this.sgz == null) {
        break label263;
      }
      if (!this.sgz.bHh())
      {
        paramBoolean = true;
        break label263;
      }
      paramBoolean = false;
      break label263;
      paramBoolean = false;
      break label301;
      paramBoolean = false;
      break label332;
      if (com.tencent.mm.plugin.wenote.model.nativenote.manager.f.dz(ab.getContext()) != 1)
      {
        paramBoolean = true;
        break label362;
      }
      paramBoolean = false;
      break label362;
    }
    label641:
    int n = -1;
    int i1 = 64536;
    int i3 = D(localRecyclerView);
    int i4 = bIm();
    int k = 0;
    int m = 0;
    i = m;
    int j = k;
    if (this.sgy != null)
    {
      i = m;
      j = k;
      if (this.sgy.getContentView() != null)
      {
        this.sgy.getContentView().measure(0, 0);
        i = this.sgy.getContentView().getMeasuredHeight();
        j = this.sgk * 2 + i;
        i = this.sgy.getContentView().getMeasuredWidth() + this.sgk * 2;
      }
    }
    if (j == 0)
    {
      m = this.sgm;
      if (i != 0) {
        break label945;
      }
      k = this.sgn;
    }
    for (;;)
    {
      if ((this.sgv != null) && (this.sgv.isShowing()) && (n(this.sgs)))
      {
        i = this.sgs[1] - m;
        j = this.sgs[1] + this.sgv.getHeight() - this.sgo;
        if ((i >= i3) && (i <= i4))
        {
          j = this.sgs[0];
          if (i != -1) {
            break label1400;
          }
          localObject1 = localRecyclerView.SW;
          if ((localObject1 == null) || (!(localObject1 instanceof LinearLayoutManager))) {
            break label1393;
          }
          localObject1 = (LinearLayoutManager)localObject1;
          j = ((LinearLayoutManager)localObject1).eZ();
          m = ((LinearLayoutManager)localObject1).fa();
          if ((this.sgA.gsM > j) || (this.sgA.endPos < m)) {
            break label1393;
          }
          i = 300;
          j = 64536;
          label920:
          if (i != -1) {
            break label1271;
          }
          bIh();
          GMTrace.o(20613695537152L, 153584);
          return;
          m = j;
          break;
          label945:
          k = i;
          continue;
        }
        if ((j < i3) || (j > i4)) {
          break label1406;
        }
        m = this.sgs[0];
        i = j;
        j = m;
      }
    }
    for (;;)
    {
      break;
      j = i1;
      i = n;
      int i2;
      if (this.sgw != null)
      {
        j = i1;
        i = n;
        if (this.sgw.isShowing())
        {
          j = i1;
          i = n;
          if (n(this.sgt))
          {
            i = this.sgt[1] - m;
            i2 = this.sgt[1] + this.sgw.getHeight() - this.sgo;
            if ((i < i3) || (i > i4)) {
              break label1165;
            }
            j = this.sgt[0];
          }
        }
      }
      for (;;)
      {
        if ((this.sgx != null) && (this.sgx.isShowing()) && (n(this.sgu)))
        {
          i1 = this.sgu[1] - m;
          n = this.sgu[1] + this.sgx.getHeight() - this.sgo;
          if (i == -1)
          {
            if ((i1 >= i3) && (i1 <= i4))
            {
              j = this.sgu[0];
              i = i1;
              break;
              label1165:
              j = i1;
              i = n;
              if (i2 < i3) {
                continue;
              }
              j = i1;
              i = n;
              if (i2 > i4) {
                continue;
              }
              j = this.sgt[0];
              i = i2;
              continue;
            }
            if ((n < i3) || (n > i4)) {
              break label1403;
            }
            j = this.sgu[0];
            i = n;
            break;
          }
          if ((i + m > this.sgu[1]) && (n >= i3) && (n <= i4))
          {
            j = this.sgu[0];
            i = n;
            break;
            label1271:
            m = this.mScreenWidth / 3;
            n = this.mScreenWidth * 2 / 3;
            if ((j == 64536) || ((j >= m) && (j <= n)))
            {
              d(localRecyclerView, (this.mScreenWidth - k) / 2, i);
              GMTrace.o(20613695537152L, 153584);
              return;
            }
            if (j < m)
            {
              d(localRecyclerView, this.sgl, i);
              GMTrace.o(20613695537152L, 153584);
              return;
            }
            d(localRecyclerView, this.mScreenWidth - k - this.sgl, i);
            GMTrace.o(20613695537152L, 153584);
            return;
            label1393:
            j = 64536;
            break label920;
            label1400:
            break label920;
          }
        }
      }
      label1403:
      break;
      label1406:
      j = 64536;
      i = -1;
    }
  }
  
  public final void jS(boolean paramBoolean)
  {
    GMTrace.i(20614232408064L, 153588);
    if (!mHasInit)
    {
      GMTrace.o(20614232408064L, 153588);
      return;
    }
    RecyclerView localRecyclerView = blo();
    int i = bIa();
    if ((localRecyclerView == null) || (i == 0) || ((i == 1) && (!paramBoolean)))
    {
      bIj();
      GMTrace.o(20614232408064L, 153588);
      return;
    }
    View localView1 = f.g(localRecyclerView, this.sgA.gsM);
    View localView2 = f.g(localRecyclerView, this.sgA.endPos);
    if (i == 1)
    {
      yG(3);
      yG(4);
      a(2, localRecyclerView, localView1, this.sgA.startOffset);
      GMTrace.o(20614232408064L, 153588);
      return;
    }
    yG(2);
    a(3, localRecyclerView, localView1, this.sgA.startOffset);
    a(4, localRecyclerView, localView2, this.sgA.sge);
    GMTrace.o(20614232408064L, 153588);
  }
  
  public final void jT(boolean paramBoolean)
  {
    GMTrace.i(20614903496704L, 153593);
    if ((!mHasInit) || (this.sgv == null) || (this.sgw == null) || (this.sgx == null) || (this.sgA == null))
    {
      GMTrace.o(20614903496704L, 153593);
      return;
    }
    RecyclerView localRecyclerView = blo();
    if (localRecyclerView == null)
    {
      GMTrace.o(20614903496704L, 153593);
      return;
    }
    if ((this.sgB == null) || (this.sgB.getType() != 1))
    {
      GMTrace.o(20614903496704L, 153593);
      return;
    }
    int k = this.sgB.jHw;
    if ((k != 2) && (k != 3) && (k != 4))
    {
      GMTrace.o(20614903496704L, 153593);
      return;
    }
    float f2 = this.sgB.sfT - this.sgB.jry;
    float f3 = this.sgB.sfU - this.sgB.iTi + this.sgh / 2;
    float f1;
    label199:
    View localView;
    c localc;
    Object localObject2;
    int i;
    if (k == 2)
    {
      f1 = f2 + this.sgv.getWidth() / 2;
      localRecyclerView.getLocationOnScreen(this.sgr);
      localView = localRecyclerView.j(f1 - this.sgr[0], f3 - this.sgr[1]);
      localc = f.cQ(localView);
      localObject2 = null;
      j = 0;
      if (localc != null) {
        break label324;
      }
      i = 2;
      localObject1 = localObject2;
    }
    for (;;)
    {
      j = 0;
      switch (i)
      {
      default: 
        GMTrace.o(20614903496704L, 153593);
        return;
        f1 = f2;
        if (k != 3) {
          break label199;
        }
        f1 = f2 + this.sgw.getWidth();
        break label199;
        label324:
        if (localc.sgb != null)
        {
          localObject1 = localc.sgb;
          localObject2 = new int[2];
          ((WXRTEditText)localObject1).getLocationOnScreen((int[])localObject2);
          i = ((WXRTEditText)localObject1).getOffsetForPosition(f1 - localObject2[0], f3 - localObject2[1]);
          i = U(k, ((WXRTEditText)localObject1).seZ, i);
        }
        else
        {
          i = j;
          localObject1 = localObject2;
          if (localc.sgc != null)
          {
            i = j;
            localObject1 = localObject2;
            if (localc.sgd != null) {
              if (k == 3)
              {
                localObject2 = localc.sgc;
                j = U(k, ((WXRTEditText)localObject2).seZ, 0);
                if (j != 2)
                {
                  i = j;
                  localObject1 = localObject2;
                  if (j != 3) {
                    break label753;
                  }
                }
                a(k, localRecyclerView, this.sgw, (int)(this.sgB.sfT - this.sgB.jry), (int)(this.sgB.sfU - this.sgB.iTi));
                i = j;
                localObject1 = localObject2;
              }
              else
              {
                if (k != 4) {
                  break label629;
                }
                localObject2 = localc.sgd;
                j = U(k, ((WXRTEditText)localObject2).seZ, 1);
                if (j != 2)
                {
                  i = j;
                  localObject1 = localObject2;
                  if (j != 3) {
                    break label753;
                  }
                }
                a(k, localRecyclerView, this.sgx, (int)(this.sgB.sfT - this.sgB.jry), (int)(this.sgB.sfU - this.sgB.iTi));
                i = j;
                localObject1 = localObject2;
              }
            }
          }
        }
        break;
      }
    }
    label629:
    Object localObject1 = new int[2];
    localView.getLocationOnScreen((int[])localObject1);
    if (f1 <= localObject1[0] + localView.getWidth() / 2) {
      localObject2 = localc.sgc;
    }
    for (int j = U(k, ((WXRTEditText)localObject2).seZ, 0);; j = U(k, ((WXRTEditText)localObject2).seZ, 1))
    {
      if (j != 2)
      {
        i = j;
        localObject1 = localObject2;
        if (j != 3) {}
      }
      else
      {
        a(k, localRecyclerView, this.sgv, (int)(this.sgB.sfT - this.sgB.jry), (int)(this.sgB.sfU - this.sgB.iTi));
        localObject1 = localObject2;
        i = j;
      }
      label753:
      break;
      localObject2 = localc.sgd;
    }
    j = 1;
    if (j != 0)
    {
      if ((paramBoolean) && ((this.sgB.sfU < D(localRecyclerView)) || (this.sgB.sfU > bIm())) && ((this.sgC == null) || (this.sgC.bQn())))
      {
        bIl();
        this.sgC.z(100L, 100L);
        GMTrace.o(20614903496704L, 153593);
        return;
        localObject2 = ((WXRTEditText)localObject1).getText();
        i = bIa();
        if ((this.sgg) && (localObject2 != null) && (i == 1))
        {
          if (!((WXRTEditText)localObject1).hasFocus()) {
            ((WXRTEditText)localObject1).requestFocus();
          }
          if ((((WXRTEditText)localObject1).seM == 1) || (((WXRTEditText)localObject1).seM == 2))
          {
            ((WXRTEditText)localObject1).sfc = true;
            ((WXRTEditText)localObject1).setSelection(0);
            ((WXRTEditText)localObject1).sfc = false;
            label951:
            if ((i == 3) || (i == 0)) {
              bIe();
            }
            bIh();
            e(true, 0L);
            if (k != 4) {
              break label1186;
            }
          }
        }
        label1186:
        for (i = this.sgA.sge;; i = this.sgA.startOffset)
        {
          a(k, localRecyclerView, localView, i);
          j = 1;
          break;
          if (this.sgA.startOffset > ((Editable)localObject2).length()) {
            break label951;
          }
          ((WXRTEditText)localObject1).sfc = true;
          ((WXRTEditText)localObject1).setSelection(this.sgA.startOffset);
          ((WXRTEditText)localObject1).sfc = false;
          break label951;
          if ((!this.sgg) || (localObject2 == null) || (i != 2) || (!((WXRTEditText)localObject1).hasFocus())) {
            break label951;
          }
          if ((((WXRTEditText)localObject1).seM == 1) || (((WXRTEditText)localObject1).seM == 2))
          {
            ((WXRTEditText)localObject1).sfc = true;
            ((WXRTEditText)localObject1).setSelection(0);
            ((WXRTEditText)localObject1).sfc = false;
            break label951;
          }
          if ((this.sgA.startOffset > ((Editable)localObject2).length()) || (this.sgA.sge > ((Editable)localObject2).length())) {
            break label951;
          }
          ((WXRTEditText)localObject1).sfc = true;
          ((WXRTEditText)localObject1).setSelection(this.sgA.startOffset, this.sgA.sge);
          ((WXRTEditText)localObject1).sfc = false;
          break label951;
        }
      }
    }
    else {
      bIl();
    }
    GMTrace.o(20614903496704L, 153593);
  }
  
  public final boolean r(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(20612084924416L, 153572);
    if (!mHasInit)
    {
      GMTrace.o(20612084924416L, 153572);
      return false;
    }
    boolean bool;
    if (this.sgA == null)
    {
      this.sgA = new d(paramInt1, paramInt2, paramInt3, paramInt4);
      bool = true;
    }
    for (;;)
    {
      if (bool) {
        w.d("NoteSelectManager", "setSelectInfo: %d:%d - %d:%d", new Object[] { Integer.valueOf(this.sgA.gsM), Integer.valueOf(this.sgA.startOffset), Integer.valueOf(this.sgA.endPos), Integer.valueOf(this.sgA.sge) });
      }
      GMTrace.o(20612084924416L, 153572);
      return bool;
      if ((this.sgA.gsM != paramInt1) || (this.sgA.startOffset != paramInt2) || (this.sgA.endPos != paramInt3) || (this.sgA.sge != paramInt4))
      {
        this.sgA.set(paramInt1, paramInt2, paramInt3, paramInt4);
        bool = true;
      }
      else
      {
        bool = false;
      }
    }
  }
  
  public final int yF(int paramInt)
  {
    GMTrace.i(20612219142144L, 153573);
    if ((!mHasInit) || (this.sgA == null))
    {
      GMTrace.o(20612219142144L, 153573);
      return 0;
    }
    if ((bIa() == 0) || (paramInt < this.sgA.gsM) || (paramInt > this.sgA.endPos))
    {
      GMTrace.o(20612219142144L, 153573);
      return 0;
    }
    if ((paramInt == this.sgA.gsM) && (paramInt == this.sgA.endPos))
    {
      GMTrace.o(20612219142144L, 153573);
      return 1;
    }
    if ((paramInt > this.sgA.gsM) && (paramInt < this.sgA.endPos))
    {
      GMTrace.o(20612219142144L, 153573);
      return 2;
    }
    if ((paramInt == this.sgA.gsM) && (paramInt < this.sgA.endPos))
    {
      GMTrace.o(20612219142144L, 153573);
      return 4;
    }
    if ((paramInt > this.sgA.gsM) && (paramInt == this.sgA.endPos))
    {
      GMTrace.o(20612219142144L, 153573);
      return 3;
    }
    GMTrace.o(20612219142144L, 153573);
    return 0;
  }
  
  public final boolean yG(int paramInt)
  {
    boolean bool = true;
    GMTrace.i(20614098190336L, 153587);
    if ((this.sgB != null) && (this.sgB.jHw == paramInt) && (this.sgB.getType() == 1))
    {
      GMTrace.o(20614098190336L, 153587);
      return false;
    }
    if ((paramInt == 2) && (this.sgv != null))
    {
      this.sgv.dismiss();
      T(2, -1, -1);
    }
    for (;;)
    {
      GMTrace.o(20614098190336L, 153587);
      return bool;
      if ((paramInt == 3) && (this.sgw != null))
      {
        this.sgw.dismiss();
        T(3, -1, -1);
      }
      else if ((paramInt == 4) && (this.sgx != null))
      {
        this.sgx.dismiss();
        T(4, -1, -1);
      }
      else
      {
        bool = false;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\nativenote\c\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */