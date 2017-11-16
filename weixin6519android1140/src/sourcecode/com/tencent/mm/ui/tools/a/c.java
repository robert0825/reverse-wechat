package com.tencent.mm.ui.tools.a;

import android.text.InputFilter;
import android.widget.EditText;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.tools.h;
import com.tencent.mm.ui.tools.h.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class c
  extends a
{
  private String iJz;
  public int iMz;
  public boolean xkl;
  public WeakReference<EditText> xkm;
  private int xkn;
  private int xko;
  private ArrayList<InputFilter> xkp;
  public a xkq;
  
  public c(WeakReference<EditText> paramWeakReference)
  {
    GMTrace.i(2033935450112L, 15154);
    this.xkl = true;
    this.xkm = paramWeakReference;
    this.iMz = h.a.xhu;
    this.xkl = false;
    GMTrace.o(2033935450112L, 15154);
  }
  
  public static c d(EditText paramEditText)
  {
    GMTrace.i(2034069667840L, 15155);
    paramEditText = new c(new WeakReference(paramEditText));
    GMTrace.o(2034069667840L, 15155);
    return paramEditText;
  }
  
  public final c Ea(int paramInt)
  {
    GMTrace.i(2034338103296L, 15157);
    this.xko = 0;
    this.xkn = paramInt;
    GMTrace.o(2034338103296L, 15157);
    return this;
  }
  
  protected final int Vk()
  {
    GMTrace.i(2034606538752L, 15159);
    if (bg.nm(this.iJz))
    {
      if (this.xkm == null)
      {
        GMTrace.o(2034606538752L, 15159);
        return 1;
      }
      this.iJz = ((EditText)this.xkm.get()).getText().toString().trim();
    }
    int j = h.de(this.iJz, this.iMz);
    if (j < 0) {}
    for (int i = 1; i != 0; i = 0)
    {
      w.w("MicroMsg.InputTextBoundaryCheck", "you are crazy =.=!that is 2 GB character!");
      GMTrace.o(2034606538752L, 15159);
      return 2;
    }
    if (j < this.xko)
    {
      GMTrace.o(2034606538752L, 15159);
      return 1;
    }
    if (j > this.xkn)
    {
      GMTrace.o(2034606538752L, 15159);
      return 2;
    }
    GMTrace.o(2034606538752L, 15159);
    return 0;
  }
  
  public final void a(a parama)
  {
    GMTrace.i(2034472321024L, 15158);
    this.xkq = parama;
    bMV();
    GMTrace.o(2034472321024L, 15158);
  }
  
  public h bD(int paramInt1, int paramInt2)
  {
    GMTrace.i(2034874974208L, 15161);
    h localh = new h(paramInt1, paramInt2);
    GMTrace.o(2034874974208L, 15161);
    return localh;
  }
  
  protected final void bMV()
  {
    GMTrace.i(2034740756480L, 15160);
    Object localObject;
    if (!this.xkl)
    {
      if (this.xkm == null)
      {
        w.w("MicroMsg.InputTextBoundaryCheck", "edit text view is null");
        GMTrace.o(2034740756480L, 15160);
        return;
      }
      if (bg.cc(this.xkp))
      {
        localObject = bD(this.xkn, this.iMz);
        ((EditText)this.xkm.get()).setFilters(new InputFilter[] { localObject });
      }
    }
    else if (this.xkq != null)
    {
      switch (Vk())
      {
      }
    }
    for (;;)
    {
      GMTrace.o(2034740756480L, 15160);
      return;
      this.xkp.add(bD(this.xkn, this.iMz));
      localObject = (InputFilter[])this.xkp.toArray(new InputFilter[this.xkp.size()]);
      ((EditText)this.xkm.get()).setFilters((InputFilter[])localObject);
      break;
      this.xkq.sT(this.iJz);
      GMTrace.o(2034740756480L, 15160);
      return;
      this.xkq.acJ();
      GMTrace.o(2034740756480L, 15160);
      return;
      this.xkq.ack();
    }
  }
  
  public final c eE(int paramInt1, int paramInt2)
  {
    GMTrace.i(2034203885568L, 15156);
    this.xko = paramInt1;
    this.xkn = paramInt2;
    GMTrace.o(2034203885568L, 15156);
    return this;
  }
  
  public static abstract interface a
  {
    public abstract void acJ();
    
    public abstract void ack();
    
    public abstract void sT(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\tools\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */