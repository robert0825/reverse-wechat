package com.tencent.mm.plugin.sight.encode.ui;

import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.fts.a.a.a;
import com.tencent.mm.plugin.fts.a.a.f;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.b.b;
import com.tencent.mm.plugin.fts.a.j;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class d
  implements TextWatcher, View.OnClickListener, View.OnFocusChangeListener, j
{
  private ae handler;
  public EditText oVD;
  public TextView oVE;
  public View oVF;
  private a oVG;
  public InputMethodManager oVH;
  public int oVI;
  public a oVJ;
  
  public d()
  {
    GMTrace.i(9321286991872L, 69449);
    this.oVI = b.oVL;
    this.handler = new ae(Looper.getMainLooper());
    GMTrace.o(9321286991872L, 69449);
  }
  
  public final void a(g paramg)
  {
    GMTrace.i(18474667606016L, 137647);
    if (paramg.aGY == 0)
    {
      if ((paramg.lxb == null) || (this.oVJ == null))
      {
        GMTrace.o(18474667606016L, 137647);
        return;
      }
      ArrayList localArrayList = new ArrayList();
      paramg = paramg.lxb.iterator();
      while (paramg.hasNext()) {
        localArrayList.add(((i)paramg.next()).lwH);
      }
      this.oVJ.br(localArrayList);
    }
    GMTrace.o(18474667606016L, 137647);
  }
  
  public final void afterTextChanged(Editable paramEditable)
  {
    GMTrace.i(9322494951424L, 69458);
    if (bg.nm(paramEditable.toString()))
    {
      GMTrace.o(9322494951424L, 69458);
      return;
    }
    paramEditable = paramEditable.toString();
    w.i("MicroMsg.MainSightSelectContactSearchHelper", "doSearch: query=%s", new Object[] { paramEditable });
    if (this.oVG != null)
    {
      ((l)h.j(l.class)).cancelSearchTask(this.oVG);
      this.oVG = null;
    }
    HashSet localHashSet = new HashSet();
    b localb = b.lxs;
    ae localae = this.handler;
    paramEditable = f.a(paramEditable, new int[] { 131072, 131075 }, null, 3, localHashSet, localb, this, localae);
    this.oVG = ((l)h.j(l.class)).search(2, paramEditable);
    GMTrace.o(9322494951424L, 69458);
  }
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(9322226515968L, 69456);
    GMTrace.o(9322226515968L, 69456);
  }
  
  public final boolean bhi()
  {
    GMTrace.i(9321421209600L, 69450);
    if (this.oVI == b.oVK)
    {
      GMTrace.o(9321421209600L, 69450);
      return true;
    }
    GMTrace.o(9321421209600L, 69450);
    return false;
  }
  
  public final void bhj()
  {
    GMTrace.i(9321823862784L, 69453);
    if (bhi())
    {
      bhk();
      GMTrace.o(9321823862784L, 69453);
      return;
    }
    if (!bhi())
    {
      this.oVI = b.oVK;
      this.oVF.setVisibility(0);
      if (this.oVJ != null) {
        this.oVJ.bhl();
      }
      this.oVD.requestFocus();
      this.oVH.showSoftInput(this.oVD, 0);
    }
    GMTrace.o(9321823862784L, 69453);
  }
  
  public final void bhk()
  {
    GMTrace.i(9321958080512L, 69454);
    if (!bhi())
    {
      GMTrace.o(9321958080512L, 69454);
      return;
    }
    this.oVD.setText("");
    this.oVD.clearFocus();
    bg.da(this.oVD);
    this.oVI = b.oVL;
    this.oVF.setVisibility(8);
    if (this.oVJ != null) {
      this.oVJ.bhm();
    }
    GMTrace.o(9321958080512L, 69454);
  }
  
  public final void onClick(View paramView)
  {
    GMTrace.i(9321689645056L, 69452);
    if (paramView.getId() == R.h.bZX)
    {
      if (!bhi())
      {
        GMTrace.o(9321689645056L, 69452);
        return;
      }
      bhj();
    }
    GMTrace.o(9321689645056L, 69452);
  }
  
  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    GMTrace.i(9321555427328L, 69451);
    if (!paramBoolean)
    {
      this.oVD.clearFocus();
      bg.da(this.oVD);
    }
    GMTrace.o(9321555427328L, 69451);
  }
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(9322360733696L, 69457);
    GMTrace.o(9322360733696L, 69457);
  }
  
  public static abstract interface a
  {
    public abstract void bhl();
    
    public abstract void bhm();
    
    public abstract void br(List<String> paramList);
  }
  
  public static enum b
  {
    static
    {
      GMTrace.i(9297933107200L, 69275);
      oVK = 1;
      oVL = 2;
      oVM = new int[] { oVK, oVL };
      GMTrace.o(9297933107200L, 69275);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sight\encode\ui\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */