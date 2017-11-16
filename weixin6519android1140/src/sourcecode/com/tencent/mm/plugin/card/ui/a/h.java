package com.tencent.mm.plugin.card.ui.a;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.card.ui.e.a;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;

public final class h
  extends a
{
  public h(MMActivity paramMMActivity)
  {
    super(paramMMActivity);
    GMTrace.i(4953976340480L, 36910);
    GMTrace.o(4953976340480L, 36910);
  }
  
  public final boolean amB()
  {
    GMTrace.i(4954781646848L, 36916);
    GMTrace.o(4954781646848L, 36916);
    return false;
  }
  
  public final boolean amC()
  {
    GMTrace.i(4954915864576L, 36917);
    if ((this.jJI) && (super.amC()))
    {
      GMTrace.o(4954915864576L, 36917);
      return true;
    }
    GMTrace.o(4954915864576L, 36917);
    return false;
  }
  
  public final boolean amG()
  {
    GMTrace.i(4955050082304L, 36918);
    GMTrace.o(4955050082304L, 36918);
    return false;
  }
  
  public final boolean amH()
  {
    GMTrace.i(4955184300032L, 36919);
    GMTrace.o(4955184300032L, 36919);
    return false;
  }
  
  public final boolean amI()
  {
    GMTrace.i(4955452735488L, 36921);
    if (super.amI())
    {
      GMTrace.o(4955452735488L, 36921);
      return true;
    }
    if (amJ())
    {
      GMTrace.o(4955452735488L, 36921);
      return true;
    }
    if ((this.jwZ.ajb()) && (this.jJI))
    {
      GMTrace.o(4955452735488L, 36921);
      return true;
    }
    GMTrace.o(4955452735488L, 36921);
    return false;
  }
  
  public final boolean amJ()
  {
    GMTrace.i(4955586953216L, 36922);
    if ((!this.jJI) && (this.jwZ.ajv().uaf == 1))
    {
      GMTrace.o(4955586953216L, 36922);
      return true;
    }
    GMTrace.o(4955586953216L, 36922);
    return false;
  }
  
  protected final void amk()
  {
    GMTrace.i(4954110558208L, 36911);
    super.amk();
    GMTrace.o(4954110558208L, 36911);
  }
  
  public final boolean amu()
  {
    GMTrace.i(4954244775936L, 36912);
    ArrayList localArrayList = com.tencent.mm.plugin.card.sharecard.a.b.ud(this.jwZ.ajA());
    if (((!this.jEZ.jxS) || (this.jEZ.jtE == 4)) && (!TextUtils.isEmpty(this.jwZ.ajB())))
    {
      GMTrace.o(4954244775936L, 36912);
      return true;
    }
    if (((this.jEZ.jxS) && (localArrayList != null) && (localArrayList.size() > 0)) || ((!TextUtils.isEmpty(this.jwZ.ajB())) && (amv())))
    {
      GMTrace.o(4954244775936L, 36912);
      return true;
    }
    GMTrace.o(4954244775936L, 36912);
    return false;
  }
  
  public final boolean amv()
  {
    GMTrace.i(4954378993664L, 36913);
    if (this.jEZ.jtE == 3)
    {
      GMTrace.o(4954378993664L, 36913);
      return true;
    }
    GMTrace.o(4954378993664L, 36913);
    return false;
  }
  
  public final boolean amw()
  {
    GMTrace.i(4954513211392L, 36914);
    GMTrace.o(4954513211392L, 36914);
    return false;
  }
  
  public final boolean amy()
  {
    GMTrace.i(4954647429120L, 36915);
    boolean bool = this.jJI;
    GMTrace.o(4954647429120L, 36915);
    return bool;
  }
  
  public final boolean amz()
  {
    GMTrace.i(4955318517760L, 36920);
    GMTrace.o(4955318517760L, 36920);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */