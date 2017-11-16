package com.tencent.mm.plugin.card.a;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.protocal.c.jp;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.protocal.c.ul;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.List;

public final class f
{
  public MMActivity iPC;
  public int jtE;
  public com.tencent.mm.plugin.card.base.b jwZ;
  public List<com.tencent.mm.plugin.card.model.b> jxd;
  public com.tencent.mm.plugin.card.model.b jxe;
  public ArrayList<jp> jxf;
  
  public f(MMActivity paramMMActivity)
  {
    GMTrace.i(5126982991872L, 38199);
    this.jtE = 3;
    this.jxd = new ArrayList();
    this.iPC = paramMMActivity;
    GMTrace.o(5126982991872L, 38199);
  }
  
  public final com.tencent.mm.plugin.card.model.b ajU()
  {
    GMTrace.i(5127117209600L, 38200);
    com.tencent.mm.plugin.card.model.b localb = new com.tencent.mm.plugin.card.model.b();
    localb.jxT = 1;
    boolean bool;
    if ((l.lV(this.jtE)) || (l.lW(this.jtE)) || (this.jtE == 23))
    {
      if ((!this.jwZ.isAcceptable()) || (this.jwZ.ajv().uac == null) || (TextUtils.isEmpty(this.jwZ.ajv().uac.text)) || (TextUtils.isEmpty(this.jwZ.ajv().tZF))) {
        break label328;
      }
      bool = true;
      localb.jxV = bool;
      if ((!localb.jxV) && (!TextUtils.isEmpty(this.jwZ.ajv().tZV))) {
        break label394;
      }
      if (!s.fC(this.jwZ.ajv().tZF)) {
        break label333;
      }
      localb.title = getString(R.l.ddh);
      localb.jxV = false;
    }
    for (;;)
    {
      if (!TextUtils.isEmpty(this.jwZ.ajv().tZX)) {
        localb.jxI = this.jwZ.ajv().tZX;
      }
      localb.jBl = "";
      localb.url = "card://jump_service";
      this.jxe = localb;
      localb = this.jxe;
      GMTrace.o(5127117209600L, 38200);
      return localb;
      if ((this.jtE == 6) && (this.jwZ.ajs()) && (this.jwZ.ajv().uac != null) && (!TextUtils.isEmpty(this.jwZ.ajv().uac.text)) && (!TextUtils.isEmpty(this.jwZ.ajv().tZF)))
      {
        bool = true;
        break;
      }
      label328:
      bool = false;
      break;
      label333:
      localb.title = getString(R.l.ddg);
      if ((this.jwZ.ajv().uac != null) && (this.jwZ.ajv().uac.umN == 1))
      {
        localb.jxW = true;
      }
      else
      {
        localb.jxW = false;
        continue;
        label394:
        localb.title = this.jwZ.ajv().tZV;
      }
    }
  }
  
  public final String getString(int paramInt)
  {
    GMTrace.i(5127385645056L, 38202);
    String str = this.iPC.getString(paramInt);
    GMTrace.o(5127385645056L, 38202);
    return str;
  }
  
  public final String getTitle()
  {
    GMTrace.i(5127251427328L, 38201);
    Object localObject = new StringBuilder();
    if (!TextUtils.isEmpty(this.jwZ.ajv().jyS)) {
      ((StringBuilder)localObject).append(this.jwZ.ajv().jyS);
    }
    for (;;)
    {
      localObject = ((StringBuilder)localObject).toString();
      GMTrace.o(5127251427328L, 38201);
      return (String)localObject;
      if (this.jwZ.ajc()) {
        ((StringBuilder)localObject).append(getString(R.l.crm));
      } else if (this.jwZ.ajd()) {
        ((StringBuilder)localObject).append(getString(R.l.cqQ));
      } else if (this.jwZ.aje()) {
        ((StringBuilder)localObject).append(getString(R.l.dcg));
      } else if (this.jwZ.ajf()) {
        ((StringBuilder)localObject).append(getString(R.l.dcz));
      } else if (this.jwZ.ajg()) {
        ((StringBuilder)localObject).append(getString(R.l.cre));
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */