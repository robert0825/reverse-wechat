package com.tencent.mm.plugin.appbrand.widget.input;

import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Looper;
import android.support.v4.view.z;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.c;
import com.tencent.mm.plugin.appbrand.widget.input.a.a;
import com.tencent.mm.plugin.appbrand.widget.input.a.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.a.c.a;
import com.tencent.mm.ui.tools.h.a;
import java.lang.ref.WeakReference;

public abstract class g
  implements x<w>
{
  private final c.a iKY;
  private t iLA;
  final Runnable iLB;
  public final a iLC;
  public boolean iLD;
  public final Runnable iLE;
  public final ae iLF;
  private final v.c iLG;
  private final v.b iLH;
  private final v.d iLI;
  public volatile b iLq;
  public volatile a iLr;
  public final View.OnFocusChangeListener iLs;
  private int iLt;
  private int iLu;
  public int iLv;
  public com.tencent.mm.plugin.appbrand.widget.input.b.e iLw;
  public String iLx;
  public w iLy;
  public v iLz;
  public WeakReference<AppBrandPageView> ieZ;
  
  public g()
  {
    GMTrace.i(10060424019968L, 74956);
    this.iLs = new View.OnFocusChangeListener()
    {
      public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        int j = 0;
        GMTrace.i(18281528295424L, 136208);
        paramAnonymousView = g.this;
        if (paramAnonymousBoolean) {
          paramAnonymousView.acu();
        }
        if (paramAnonymousView.iLz == null) {
          paramAnonymousView.iLz = paramAnonymousView.acx();
        }
        if (paramAnonymousView.iLr != null) {
          paramAnonymousView.iLr.cf(paramAnonymousBoolean);
        }
        if ((paramAnonymousView.iLy != null) && (paramAnonymousBoolean) && (paramAnonymousView.iLw.iQE.booleanValue())) {
          af.i(paramAnonymousView.iLB, 100L);
        }
        if ((paramAnonymousView.iLy != null) && (!paramAnonymousBoolean) && (!paramAnonymousView.iLw.iQh))
        {
          if (paramAnonymousView.iLv == 0) {
            paramAnonymousView.cM(false);
          }
          paramAnonymousView.iLy.setFocusable(false);
          paramAnonymousView.iLy.setFocusableInTouchMode(false);
          if (paramAnonymousView.iLz.iNj == paramAnonymousView.iLy)
          {
            paramAnonymousView.iLz.hide();
            paramAnonymousView.iLz.b(paramAnonymousView.iLy);
          }
        }
        if ((paramAnonymousView.iLz != null) && (paramAnonymousView.iLy != null) && (!paramAnonymousBoolean) && (paramAnonymousView.iLw.iQh))
        {
          paramAnonymousView.cM(false);
          if (paramAnonymousView.iLw.iQh)
          {
            paramAnonymousView.a(paramAnonymousView.iLy);
            paramAnonymousView.onDestroy();
          }
        }
        int i = j;
        if (paramAnonymousBoolean) {
          if (g.this.iLw.iQh)
          {
            i = j;
            if (!com.tencent.mm.plugin.appbrand.ui.g.bI(g.this.iLy)) {}
          }
          else
          {
            i = 1;
          }
        }
        if ((i != 0) && (g.this.iLy != null) && (g.this.iLz != null))
        {
          g.this.iLy.requestFocus();
          g.this.iLz.show();
        }
        GMTrace.o(18281528295424L, 136208);
      }
    };
    this.iLt = -1;
    this.iLu = -1;
    this.iLv = 0;
    this.iKY = new n.a()
    {
      public final void ack()
      {
        GMTrace.i(18280722989056L, 136202);
        if (g.this.iLy != null) {
          try
          {
            g.this.iLC.a(g.this.iLy.getEditableText(), false);
            GMTrace.o(18280722989056L, 136202);
            return;
          }
          catch (Exception localException) {}
        }
        GMTrace.o(18280722989056L, 136202);
      }
    };
    this.iLB = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10089817702400L, 75175);
        g.this.act();
        GMTrace.o(10089817702400L, 75175);
      }
    };
    this.iLC = new a();
    this.iLD = false;
    this.iLE = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10080825114624L, 75108);
        g.this.iLD = false;
        GMTrace.o(10080825114624L, 75108);
      }
    };
    this.iLF = new ae(Looper.getMainLooper());
    this.iLG = new v.c()
    {
      public final boolean sQ(String paramAnonymousString)
      {
        GMTrace.i(18253879443456L, 136002);
        if (g.this.iLy != null)
        {
          if (!"[DELETE_EMOTION]".equalsIgnoreCase(paramAnonymousString)) {
            break label125;
          }
          paramAnonymousString = g.this.iLy;
          if (paramAnonymousString.iNq == null) {
            break label92;
          }
          if (!bg.L(paramAnonymousString.getEditableText())) {
            paramAnonymousString.iNq.deleteSurroundingText(paramAnonymousString.getEditableText().length(), paramAnonymousString.getEditableText().length() - 1);
          }
        }
        for (;;)
        {
          GMTrace.o(18253879443456L, 136002);
          return true;
          label92:
          paramAnonymousString.dispatchKeyEvent(new KeyEvent(0, 67));
          paramAnonymousString.dispatchKeyEvent(new KeyEvent(1, 67));
        }
        label125:
        w localw = g.this.iLy;
        if (localw.getEditableText() == null) {
          localw.setText(paramAnonymousString, TextView.BufferType.EDITABLE);
        }
        for (;;)
        {
          localw.setSelection(localw.getEditableText().length());
          break;
          localw.getEditableText().append(paramAnonymousString);
        }
      }
    };
    this.iLH = new v.b()
    {
      public final void cN(boolean paramAnonymousBoolean)
      {
        GMTrace.i(18255758491648L, 136016);
        if (paramAnonymousBoolean) {
          g.this.iLv = g.c.iLM;
        }
        g.this.acw();
        g.this.iLv = 0;
        GMTrace.o(18255758491648L, 136016);
      }
    };
    this.iLI = new v.d()
    {
      public final void jY(int paramAnonymousInt)
      {
        GMTrace.i(18248108081152L, 135959);
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AppBrandInputInvokeHandler", "[appInput], onSmileyPanelVisibilityChanged = %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        if (paramAnonymousInt != 2)
        {
          if ((paramAnonymousInt == 0) && (g.this.iLy != null)) {
            g.this.iLy.requestFocus();
          }
          g.this.acz();
          if ((g.this.ieZ != null) && (g.this.ieZ.get() != null))
          {
            m.a((AppBrandPageView)g.this.ieZ.get(), g.this.iLy);
            GMTrace.o(18248108081152L, 135959);
          }
        }
        else
        {
          g.this.iLv = g.c.iLL;
          g.this.acw();
          g.this.iLv = 0;
        }
        GMTrace.o(18248108081152L, 135959);
      }
    };
    GMTrace.o(10060424019968L, 74956);
  }
  
  private boolean a(w paramw, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(18254282096640L, 136005);
    if ((paramw == null) || (this.ieZ == null) || (this.ieZ.get() == null))
    {
      GMTrace.o(18254282096640L, 136005);
      return false;
    }
    e locale = ((AppBrandPageView)this.ieZ.get()).ivi;
    if ((locale != null) && (locale.b(((AppBrandPageView)this.ieZ.get()).ivj, paramw, paramInt1, paramInt2, paramInt3, paramInt4)))
    {
      GMTrace.o(18254282096640L, 136005);
      return true;
    }
    GMTrace.o(18254282096640L, 136005);
    return false;
  }
  
  private void acr()
  {
    GMTrace.i(15424435519488L, 114921);
    int k;
    int i;
    if ((this.iLy != null) && (ad.d(this.iLw.iQG)) && (ad.d(this.iLw.iQE)))
    {
      ((o)this.iLy).cP(true);
      j = this.iLy.getLineHeight();
      k = this.iLy.adb();
      if ((this.iLw.iQp != null) && (this.iLw.iQp.intValue() > 0)) {
        break label192;
      }
      i = j;
      if ((this.iLw.iQq != null) && (this.iLw.iQq.intValue() > 0)) {
        break label206;
      }
    }
    label192:
    label206:
    for (int j = Integer.MAX_VALUE;; j = Math.max(this.iLw.iQq.intValue(), j))
    {
      this.iLy.setMinHeight(i);
      this.iLy.setMaxHeight(j);
      a(this.iLy, this.iLw.iQl.intValue(), Math.max(i, Math.min(k, j)), this.iLw.iQo.intValue(), this.iLw.iQn.intValue());
      GMTrace.o(15424435519488L, 114921);
      return;
      i = this.iLw.iQp.intValue();
      break;
    }
  }
  
  private void jX(int paramInt)
  {
    GMTrace.i(19863418437632L, 147994);
    if ((this.iLy == null) || (this.iLy.getEditableText() == null))
    {
      GMTrace.o(19863418437632L, 147994);
      return;
    }
    if (paramInt <= -2)
    {
      GMTrace.o(19863418437632L, 147994);
      return;
    }
    int i = paramInt;
    if (-1 == paramInt) {
      i = this.iLy.getEditableText().length();
    }
    this.iLy.setSelection(i);
    act();
    GMTrace.o(19863418437632L, 147994);
  }
  
  public abstract void WO();
  
  public abstract void WP();
  
  final void a(w paramw)
  {
    GMTrace.i(18254416314368L, 136006);
    if (paramw == null)
    {
      GMTrace.o(18254416314368L, 136006);
      return;
    }
    paramw.b(this.iLs);
    if (this.ieZ == null) {}
    for (Object localObject = null;; localObject = (AppBrandPageView)this.ieZ.get())
    {
      if (localObject != null)
      {
        localObject = ((AppBrandPageView)localObject).ivi;
        if (localObject != null) {
          ((e)localObject).bP(paramw);
        }
      }
      GMTrace.o(18254416314368L, 136006);
      return;
    }
  }
  
  public final boolean acg()
  {
    GMTrace.i(17638893813760L, 131420);
    int i;
    if ((this.iLy == null) || (this.ieZ == null) || (this.ieZ.get() == null)) {
      i = 0;
    }
    while (i != 0)
    {
      onDestroy();
      GMTrace.o(17638893813760L, 131420);
      return true;
      this.iLy.destroy();
      e locale = ((AppBrandPageView)this.ieZ.get()).ivi;
      if (locale == null)
      {
        i = 0;
      }
      else
      {
        if (this.iLy.hasFocus())
        {
          if (this.iLA != null) {
            this.iLA.setVisibility(8);
          }
          acx();
          if (this.iLz != null) {
            this.iLz.setVisibility(8);
          }
        }
        locale.bP(this.iLy);
        i = 1;
      }
    }
    GMTrace.o(17638893813760L, 131420);
    return false;
  }
  
  public final View acl()
  {
    GMTrace.i(17639028031488L, 131421);
    v localv = this.iLz;
    GMTrace.o(17639028031488L, 131421);
    return localv;
  }
  
  public final int acm()
  {
    GMTrace.i(17639296466944L, 131423);
    if ((this.iLw != null) && (this.iLw.iQI != null))
    {
      int i = this.iLw.iQI.intValue();
      GMTrace.o(17639296466944L, 131423);
      return i;
    }
    if ((this.iLy != null) && (this.iLy.acL()))
    {
      GMTrace.o(17639296466944L, 131423);
      return 5;
    }
    GMTrace.o(17639296466944L, 131423);
    return 0;
  }
  
  public final boolean acn()
  {
    GMTrace.i(17638759596032L, 131419);
    int i;
    if ((this.iLy != null) && ((this.iLy.isFocused()) || ((acx() != null) && (acx().iNj == this.iLy))))
    {
      i = 1;
      if (i != 0) {
        break label78;
      }
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AppBrandInputInvokeHandler", "doHideKeyboard, not focused, return");
    }
    for (;;)
    {
      GMTrace.o(17638759596032L, 131419);
      return true;
      i = 0;
      break;
      label78:
      v localv = acx();
      if (localv != null) {
        localv.setVisibility(8);
      }
    }
  }
  
  public final void acs()
  {
    GMTrace.i(16052977139712L, 119604);
    if (this.iLy == null)
    {
      GMTrace.o(16052977139712L, 119604);
      return;
    }
    if ((this.iLy.getLineCount() == this.iLt) && (this.iLy.adb() == this.iLu))
    {
      GMTrace.o(16052977139712L, 119604);
      return;
    }
    if (this.iLt == -1) {}
    for (int i = 1;; i = 0)
    {
      this.iLt = this.iLy.getLineCount();
      this.iLu = this.iLy.adb();
      if (this.iLq != null) {
        this.iLq.br(this.iLt, this.iLu);
      }
      if ((this.iLw.iQE.booleanValue()) && (i == 0))
      {
        acr();
        act();
      }
      GMTrace.o(16052977139712L, 119604);
      return;
    }
  }
  
  public final void act()
  {
    GMTrace.i(15424569737216L, 114922);
    if ((this.iLw.iQE.booleanValue()) && (this.iLz != null) && (this.iLz.isShown()) && (this.iLy != null) && (this.iLy == this.iLz.iNj)) {
      i.a(this.ieZ).acC();
    }
    GMTrace.o(15424569737216L, 114922);
  }
  
  public final void acu()
  {
    GMTrace.i(10061497761792L, 74964);
    if (this.iLw.iQE.booleanValue()) {
      acx();
    }
    if ((this.iLz != null) && (this.iLy != null))
    {
      this.iLz.iNj = this.iLy;
      this.iLz.cS(ad.d(this.iLw.iQF));
      acv();
      if ((com.tencent.mm.plugin.appbrand.ui.g.bI(this.iLy)) && (this.iLy.hasFocus())) {
        this.iLz.show();
      }
      GMTrace.o(10061497761792L, 74964);
      return;
    }
    GMTrace.o(10061497761792L, 74964);
  }
  
  public final void acv()
  {
    GMTrace.i(10062034632704L, 74968);
    if (this.iLz == null)
    {
      GMTrace.o(10062034632704L, 74968);
      return;
    }
    this.iLz.iMZ = this.iLG;
    this.iLz.iNa = this.iLH;
    this.iLz.iNc = this.iLI;
    GMTrace.o(10062034632704L, 74968);
  }
  
  public final void acw()
  {
    GMTrace.i(16053379792896L, 119607);
    if ((this.iLv == c.iLM) && (ad.d(this.iLw.iQK))) {}
    for (boolean bool = true;; bool = false)
    {
      if (!bool) {
        acy();
      }
      if (this.iLy == null) {
        break label139;
      }
      if (this.iLy.hasFocus()) {
        cM(bool);
      }
      if (bool) {
        break label139;
      }
      if (this.iLz != null) {
        this.iLz.b(this.iLy);
      }
      if (!this.iLw.iQh) {
        break;
      }
      a(this.iLy);
      onDestroy();
      GMTrace.o(16053379792896L, 119607);
      return;
    }
    this.iLy.setFocusable(false);
    this.iLy.setFocusableInTouchMode(false);
    label139:
    GMTrace.o(16053379792896L, 119607);
  }
  
  final v acx()
  {
    GMTrace.i(18254550532096L, 136007);
    if (this.iLz != null)
    {
      localObject = this.iLz;
      GMTrace.o(18254550532096L, 136007);
      return (v)localObject;
    }
    if (this.ieZ != null)
    {
      localObject = (AppBrandPageView)this.ieZ.get();
      if (localObject != null) {}
    }
    else
    {
      GMTrace.o(18254550532096L, 136007);
      return null;
    }
    Object localObject = v.bW(((AppBrandPageView)localObject).iuf);
    this.iLz = ((v)localObject);
    GMTrace.o(18254550532096L, 136007);
    return (v)localObject;
  }
  
  public final void acy()
  {
    GMTrace.i(10062437285888L, 74971);
    if (acx() != null) {
      this.iLz.hide();
    }
    for (;;)
    {
      i.a(this.ieZ).acD();
      GMTrace.o(10062437285888L, 74971);
      return;
      if (this.ieZ != null)
      {
        Object localObject = (AppBrandPageView)this.ieZ.get();
        if (localObject == null)
        {
          GMTrace.o(10062437285888L, 74971);
          return;
        }
        localObject = com.tencent.mm.plugin.appbrand.ui.g.bR(((AppBrandPageView)localObject).mContext);
        if ((localObject instanceof MMActivity)) {
          ((MMActivity)localObject).aLo();
        }
      }
    }
  }
  
  public final void acz()
  {
    GMTrace.i(10062705721344L, 74973);
    Object localObject;
    if (this.iLA != null) {
      localObject = this.iLA;
    }
    for (;;)
    {
      if (localObject != null) {
        this.iLA.setVisibility(8);
      }
      GMTrace.o(10062705721344L, 74973);
      return;
      if (this.ieZ != null)
      {
        localObject = (AppBrandPageView)this.ieZ.get();
        if (localObject != null) {}
      }
      else
      {
        localObject = null;
        continue;
      }
      localObject = t.bU(((AppBrandPageView)localObject).iuf);
      this.iLA = ((t)localObject);
    }
  }
  
  public abstract void b(String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2);
  
  public final void b(String paramString, Integer paramInteger)
  {
    GMTrace.i(19863284219904L, 147993);
    if (this.iLy == null)
    {
      GMTrace.o(19863284219904L, 147993);
      return;
    }
    this.iLy.r(paramString);
    if (paramInteger == null) {}
    for (int i = -1;; i = paramInteger.intValue())
    {
      jX(i);
      acs();
      GMTrace.o(19863284219904L, 147993);
      return;
    }
  }
  
  public final void cL(boolean paramBoolean)
  {
    GMTrace.i(10061363544064L, 74963);
    if ((this.iLy == null) || ((!paramBoolean) && (!z.al(this.iLy))))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandInputInvokeHandler", "updateInputImpl, input is null or detached, skip");
      GMTrace.o(10061363544064L, 74963);
      return;
    }
    label201:
    Object localObject;
    if (!ad.d(this.iLw.iQG))
    {
      a(this.iLy, this.iLw.iQl.intValue(), this.iLw.iQm.intValue(), this.iLw.iQo.intValue(), this.iLw.iQn.intValue());
      if (this.iLw.iQu != null) {
        this.iLy.setTextSize(0, this.iLw.iQu.intValue());
      }
      if (this.iLw.iQt != null) {
        this.iLy.setTextColor(this.iLw.iQt.intValue());
      }
      if (this.iLw.iQs == null) {
        break label777;
      }
      this.iLy.setBackgroundDrawable(new ColorDrawable(this.iLw.iQs.intValue()));
      if (!bg.nm(this.iLw.iQy))
      {
        localObject = this.iLy;
        SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(this.iLw.iQy);
        int i = this.iLw.iQy.length();
        localSpannableStringBuilder.setSpan(new StyleSpan(com.tencent.mm.plugin.appbrand.widget.input.b.c.sW(this.iLw.iQz).style), 0, i, 18);
        if (this.iLw.iQB != null) {
          localSpannableStringBuilder.setSpan(new ForegroundColorSpan(this.iLw.iQB.intValue()), 0, i, 18);
        }
        if (this.iLw.iQA != null) {
          localSpannableStringBuilder.setSpan(new AbsoluteSizeSpan(this.iLw.iQA.intValue(), false), 0, i, 18);
        }
        ((w)localObject).setHint(localSpannableStringBuilder);
      }
      if (this.iLw.iQw != null)
      {
        localObject = Typeface.create("sans-serif", com.tencent.mm.plugin.appbrand.widget.input.b.c.sW(this.iLw.iQw).style);
        if (localObject != null) {
          this.iLy.setTypeface((Typeface)localObject);
        }
      }
      if (this.iLw.iQk != null)
      {
        if (!paramBoolean) {
          break label788;
        }
        this.iLy.setText(bg.nl(this.iLw.iQk));
        label432:
        if ((ad.d(this.iLw.iQG)) && (this.iLy != null)) {
          acs();
        }
      }
      if (this.iLw.iQx != null) {
        break label808;
      }
      this.iLw.iQx = Integer.valueOf(140);
      label479:
      localObject = n.a(this.iLy).Ea(this.iLw.iQx.intValue());
      ((com.tencent.mm.ui.tools.a.c)localObject).xkl = false;
      ((com.tencent.mm.ui.tools.a.c)localObject).iMz = h.a.xht;
      ((com.tencent.mm.ui.tools.a.c)localObject).a(this.iKY);
      this.iLy.cQ(this.iLw.iQg);
      if ((this.iLw.iQC == null) || (!this.iLw.iQC.booleanValue())) {
        break label836;
      }
      this.iLy.setEnabled(false);
      this.iLy.setFocusable(false);
      this.iLy.setFocusableInTouchMode(false);
      this.iLy.setClickable(false);
      label593:
      com.tencent.mm.plugin.appbrand.widget.input.b.g.sX(this.iLw.iQr).a(this.iLy);
      if (!ad.d(this.iLw.iQD)) {
        break label855;
      }
      this.iLy.setVisibility(8);
    }
    for (;;)
    {
      if (this.iLw.iQH != null) {
        this.iLy.iNE = this.iLw.iQH.booleanValue();
      }
      if ((this.iLy != null) && ((this.iLy instanceof o)))
      {
        if (this.iLw.iQL != null)
        {
          localObject = (o)this.iLy;
          ((o)localObject).setLineSpacing(this.iLw.iQL.intValue(), ((o)localObject).iMF);
        }
        if (this.iLw.iQM != null)
        {
          localObject = (o)this.iLy;
          float f = this.iLw.iQM.intValue();
          if (f > 0.0F) {
            ((o)localObject).a(f, true);
          }
        }
      }
      GMTrace.o(10061363544064L, 74963);
      return;
      acr();
      break;
      label777:
      this.iLy.setBackgroundDrawable(null);
      break label201;
      label788:
      this.iLy.r(bg.nl(this.iLw.iQk));
      break label432;
      label808:
      if (this.iLw.iQx.intValue() > 0) {
        break label479;
      }
      this.iLw.iQx = Integer.valueOf(Integer.MAX_VALUE);
      break label479;
      label836:
      this.iLy.setEnabled(true);
      this.iLy.setClickable(true);
      break label593;
      label855:
      this.iLy.setVisibility(0);
    }
  }
  
  final void cM(boolean paramBoolean)
  {
    GMTrace.i(10062168850432L, 74969);
    if (this.iLy == null)
    {
      GMTrace.o(10062168850432L, 74969);
      return;
    }
    String str = this.iLy.getText().toString();
    int i = this.iLy.getSelectionEnd();
    if (this.iLv == c.iLM) {}
    for (boolean bool = true;; bool = false)
    {
      b(str, i, bool, paramBoolean);
      GMTrace.o(10062168850432L, 74969);
      return;
    }
  }
  
  public final boolean g(AppBrandPageView paramAppBrandPageView)
  {
    GMTrace.i(17638491160576L, 131417);
    if ((paramAppBrandPageView != null) && (this.ieZ != null) && (paramAppBrandPageView == this.ieZ.get()))
    {
      GMTrace.o(17638491160576L, 131417);
      return true;
    }
    GMTrace.o(17638491160576L, 131417);
    return false;
  }
  
  public final boolean jW(int paramInt)
  {
    GMTrace.i(18254147878912L, 136004);
    if ((this.iLy == null) || (this.ieZ == null) || (this.ieZ.get() == null)) {}
    for (;;)
    {
      jX(paramInt);
      GMTrace.o(18254147878912L, 136004);
      return true;
      this.iLy.performClick();
    }
  }
  
  final void onDestroy()
  {
    GMTrace.i(10061095108608L, 74961);
    this.iLy = null;
    d.aS(this);
    GMTrace.o(10061095108608L, 74961);
  }
  
  public static abstract interface a
  {
    public abstract void cf(boolean paramBoolean);
  }
  
  public static abstract interface b
  {
    public abstract void br(int paramInt1, int paramInt2);
  }
  
  private static enum c
  {
    static
    {
      GMTrace.i(18846987583488L, 140421);
      iLL = 1;
      iLM = 2;
      iLN = new int[] { iLL, iLM };
      GMTrace.o(18846987583488L, 140421);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */