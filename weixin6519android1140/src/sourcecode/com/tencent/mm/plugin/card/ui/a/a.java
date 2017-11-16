package com.tencent.mm.plugin.card.ui.a;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.ui.e.a;
import com.tencent.mm.protocal.c.jm;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.protocal.c.np;
import com.tencent.mm.protocal.c.pu;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.y.q;
import java.util.LinkedList;

public class a
  implements g
{
  protected MMActivity iPC;
  protected e.a jEZ;
  boolean jJI;
  private boolean jJJ;
  private boolean jJK;
  private boolean jJL;
  private boolean jJM;
  private boolean jJN;
  private boolean jJO;
  private boolean jJP;
  private boolean jJQ;
  private boolean jJR;
  protected b jwZ;
  
  public a(MMActivity paramMMActivity)
  {
    GMTrace.i(4948741849088L, 36871);
    this.jJI = false;
    this.jJJ = false;
    this.jJK = false;
    this.jJL = false;
    this.jJM = false;
    this.jJN = false;
    this.jJO = false;
    this.jJP = false;
    this.jJQ = false;
    this.jJR = false;
    this.iPC = paramMMActivity;
    GMTrace.o(4948741849088L, 36871);
  }
  
  private boolean amh()
  {
    GMTrace.i(4949681373184L, 36878);
    if (!TextUtils.isEmpty(this.jwZ.ajw().code))
    {
      GMTrace.o(4949681373184L, 36878);
      return true;
    }
    GMTrace.o(4949681373184L, 36878);
    return false;
  }
  
  private String getString(int paramInt)
  {
    GMTrace.i(4949278720000L, 36875);
    String str = this.iPC.getString(paramInt);
    GMTrace.o(4949278720000L, 36875);
    return str;
  }
  
  public final void a(b paramb, e.a parama)
  {
    GMTrace.i(4948876066816L, 36872);
    this.jwZ = paramb;
    this.jEZ = parama;
    amk();
    GMTrace.o(4948876066816L, 36872);
  }
  
  public final boolean alJ()
  {
    GMTrace.i(4950218244096L, 36882);
    boolean bool = this.jJI;
    GMTrace.o(4950218244096L, 36882);
    return bool;
  }
  
  public boolean amA()
  {
    GMTrace.i(4952365727744L, 36898);
    GMTrace.o(4952365727744L, 36898);
    return false;
  }
  
  public boolean amB()
  {
    GMTrace.i(4952499945472L, 36899);
    if (!this.jwZ.ajr())
    {
      GMTrace.o(4952499945472L, 36899);
      return true;
    }
    GMTrace.o(4952499945472L, 36899);
    return false;
  }
  
  public boolean amC()
  {
    GMTrace.i(4952634163200L, 36900);
    if ((this.jwZ.ajv().uaa != null) && (this.jwZ.ajv().uaa.ufP != null) && (this.jwZ.ajv().uaa.ufP.size() > 0) && (!TextUtils.isEmpty((CharSequence)this.jwZ.ajv().uaa.ufP.get(0))))
    {
      GMTrace.o(4952634163200L, 36900);
      return true;
    }
    GMTrace.o(4952634163200L, 36900);
    return false;
  }
  
  public boolean amD()
  {
    GMTrace.i(4952768380928L, 36901);
    if ((this.jwZ.ajw().tZg != null) && (this.jwZ.ajw().tZg.size() > 0) && (((amf()) && (amg())) || (this.jJI)))
    {
      GMTrace.o(4952768380928L, 36901);
      return true;
    }
    GMTrace.o(4952768380928L, 36901);
    return false;
  }
  
  public boolean amE()
  {
    GMTrace.i(4952902598656L, 36902);
    GMTrace.o(4952902598656L, 36902);
    return false;
  }
  
  public final boolean amF()
  {
    GMTrace.i(4953036816384L, 36903);
    if ((this.jwZ.ajw().tZk != null) && (!TextUtils.isEmpty(this.jwZ.ajw().tZk.title)))
    {
      GMTrace.o(4953036816384L, 36903);
      return true;
    }
    GMTrace.o(4953036816384L, 36903);
    return false;
  }
  
  public boolean amG()
  {
    GMTrace.i(4953171034112L, 36904);
    if ((this.jwZ.ajw().tZn != null) && (!TextUtils.isEmpty(this.jwZ.ajw().tZn.title)))
    {
      GMTrace.o(4953171034112L, 36904);
      return true;
    }
    GMTrace.o(4953171034112L, 36904);
    return false;
  }
  
  public boolean amH()
  {
    GMTrace.i(4953305251840L, 36905);
    if (this.jwZ.ajv().tZW != null)
    {
      GMTrace.o(4953305251840L, 36905);
      return true;
    }
    GMTrace.o(4953305251840L, 36905);
    return false;
  }
  
  public boolean amI()
  {
    GMTrace.i(4953439469568L, 36906);
    if (!TextUtils.isEmpty(this.jwZ.ajv().tZT))
    {
      GMTrace.o(4953439469568L, 36906);
      return true;
    }
    GMTrace.o(4953439469568L, 36906);
    return false;
  }
  
  public boolean amJ()
  {
    GMTrace.i(4953573687296L, 36907);
    GMTrace.o(4953573687296L, 36907);
    return false;
  }
  
  public boolean amK()
  {
    GMTrace.i(4953707905024L, 36908);
    GMTrace.o(4953707905024L, 36908);
    return false;
  }
  
  public final void amL()
  {
    int i6 = 1;
    GMTrace.i(4953842122752L, 36909);
    int i;
    String str;
    int j;
    label35:
    int k;
    label44:
    int m;
    label54:
    int n;
    label64:
    int i1;
    label74:
    int i2;
    label84:
    int i3;
    label94:
    int i4;
    label104:
    int i5;
    if (amh())
    {
      i = 1;
      str = ame();
      if (!this.jJI) {
        break label243;
      }
      j = 1;
      if (!aml()) {
        break label248;
      }
      k = 1;
      if (!this.jJK) {
        break label253;
      }
      m = 1;
      if (!this.jJL) {
        break label259;
      }
      n = 1;
      if (!this.jJM) {
        break label265;
      }
      i1 = 1;
      if (!this.jJN) {
        break label271;
      }
      i2 = 1;
      if (!this.jJO) {
        break label277;
      }
      i3 = 1;
      if (!this.jJP) {
        break label283;
      }
      i4 = 1;
      if (!this.jJQ) {
        break label289;
      }
      i5 = 1;
      label114:
      if (!this.jJR) {
        break label295;
      }
    }
    for (;;)
    {
      w.i("MicroMsg.CardBaseShowLogic", "printStatus, isValidCode:%d, getUnacceptWording:%s, isAcceptedCard:%d, acceptViewVisible:%d, acceptViewEnabled:%d, isShowConsumedBtn:%d, isConsumedBtnEnabled:%d, enableOptionMenu:%d, isShareLogoVisible:%d, addShareMenu:%d, addMenu:%d, addInvalidCardMenu:%d ", new Object[] { Integer.valueOf(i), str, Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6) });
      GMTrace.o(4953842122752L, 36909);
      return;
      i = 0;
      break;
      label243:
      j = 0;
      break label35;
      label248:
      k = 0;
      break label44;
      label253:
      m = 0;
      break label54;
      label259:
      n = 0;
      break label64;
      label265:
      i1 = 0;
      break label74;
      label271:
      i2 = 0;
      break label84;
      label277:
      i3 = 0;
      break label94;
      label283:
      i4 = 0;
      break label104;
      label289:
      i5 = 0;
      break label114;
      label295:
      i6 = 0;
    }
  }
  
  public final String ame()
  {
    GMTrace.i(4949144502272L, 36874);
    String str = "";
    if (!TextUtils.isEmpty(this.jwZ.ajv().uag)) {
      str = this.jwZ.ajv().uag;
    }
    for (;;)
    {
      GMTrace.o(4949144502272L, 36874);
      return str;
      if (this.jwZ.ajw().tZh == 0L) {
        str = getString(R.l.ddn);
      } else if (this.jwZ.ajw().tZi == 0) {
        if (!TextUtils.isEmpty(this.jwZ.ajv().tZN)) {
          str = this.jwZ.ajv().tZN;
        } else {
          str = getString(R.l.dbV);
        }
      }
    }
  }
  
  public final boolean amf()
  {
    GMTrace.i(4949412937728L, 36876);
    if ((this.jwZ.ajw().status == 0) || (this.jwZ.ajw().status == 1) || (this.jwZ.ajw().status == 2))
    {
      GMTrace.o(4949412937728L, 36876);
      return true;
    }
    GMTrace.o(4949412937728L, 36876);
    return false;
  }
  
  public final boolean amg()
  {
    GMTrace.i(4949547155456L, 36877);
    if ((this.jEZ.jtE == 3) || ((this.jEZ.jtE == 6) && (this.jwZ.ajw().tZe == 0)) || (this.jEZ.jtE == 4) || (this.jEZ.jtE == 5) || (this.jEZ.jtE == 15))
    {
      GMTrace.o(4949547155456L, 36877);
      return true;
    }
    GMTrace.o(4949547155456L, 36877);
    return false;
  }
  
  protected final boolean ami()
  {
    GMTrace.i(4949815590912L, 36879);
    if ((!this.jwZ.isAcceptable()) && ((l.lV(this.jEZ.jtE)) || (l.lW(this.jEZ.jtE)) || (this.jEZ.jtE == 23)))
    {
      GMTrace.o(4949815590912L, 36879);
      return true;
    }
    GMTrace.o(4949815590912L, 36879);
    return false;
  }
  
  protected final boolean amj()
  {
    GMTrace.i(4949949808640L, 36880);
    if ((!this.jwZ.ajs()) && (this.jEZ.jtE == 6))
    {
      GMTrace.o(4949949808640L, 36880);
      return true;
    }
    GMTrace.o(4949949808640L, 36880);
    return false;
  }
  
  protected void amk()
  {
    GMTrace.i(4950084026368L, 36881);
    w.i("MicroMsg.CardBaseShowLogic", "updateAcceptState()");
    if ((l.lV(this.jEZ.jtE)) || (l.lW(this.jEZ.jtE))) {
      if (this.jwZ.isAcceptable())
      {
        this.jJJ = true;
        this.jJK = true;
        this.jJP = true;
        this.jJN = true;
        this.jJO = true;
        if (!this.jwZ.ajq()) {
          break label580;
        }
        this.jJJ = false;
        this.jJK = false;
        w.i("MicroMsg.CardBaseShowLogic", "need direct jump!");
        label110:
        if (!this.jJI) {
          break label591;
        }
        this.jJJ = false;
        this.jJK = false;
        w.i("MicroMsg.CardBaseShowLogic", "updateAcceptView to gone!");
      }
    }
    for (;;)
    {
      w.i("MicroMsg.CardBaseShowLogic", "mIsAcceptedCard:" + this.jJI);
      GMTrace.o(4950084026368L, 36881);
      return;
      if (!this.jwZ.isAcceptable())
      {
        this.jJJ = true;
        this.jJK = false;
        if (this.jwZ.ajq())
        {
          this.jJQ = true;
          this.jJN = true;
          this.jJM = true;
        }
        for (;;)
        {
          this.jJO = true;
          break;
          this.jJN = false;
        }
      }
      this.jJJ = false;
      this.jJK = false;
      this.jJN = false;
      break;
      if (this.jEZ.jtE == 6)
      {
        if (this.jwZ.ajs())
        {
          this.jJJ = true;
          this.jJK = true;
          this.jJN = false;
          break;
        }
        if (this.jwZ.ajr())
        {
          this.jJQ = true;
          this.jJN = true;
          this.jJL = true;
          this.jJM = true;
          break;
        }
        this.jJJ = false;
        this.jJK = false;
        this.jJN = false;
        this.jJL = true;
        break;
      }
      if (l.lX(this.jEZ.jtE))
      {
        this.jJJ = false;
        this.jJK = false;
        this.jJL = true;
        if (this.jwZ.ajr())
        {
          this.jJQ = true;
          this.jJN = true;
          this.jJM = true;
          break;
        }
        this.jJR = true;
        break;
      }
      if (this.jEZ.jtE != 23) {
        break;
      }
      if (this.jwZ.isAcceptable())
      {
        this.jJJ = true;
        this.jJK = true;
        this.jJN = false;
      }
      for (this.jJO = true;; this.jJO = true)
      {
        if ((TextUtils.isEmpty(this.jEZ.jEj)) || (this.jEZ.jEj.equals(q.zE())) || (this.jwZ.aju())) {
          break label578;
        }
        w.i("MicroMsg.CardBaseShowLogic", " detail page");
        this.jJJ = false;
        this.jJK = false;
        this.jJL = true;
        if (!this.jwZ.ajr()) {
          break;
        }
        this.jJQ = true;
        this.jJN = true;
        this.jJM = true;
        break;
        this.jJJ = true;
        this.jJK = false;
        this.jJN = false;
      }
      label578:
      break;
      label580:
      w.i("MicroMsg.CardBaseShowLogic", "not need direct jump!");
      break label110;
      label591:
      if (!this.jJJ)
      {
        this.jJI = true;
        w.i("MicroMsg.CardBaseShowLogic", "set mIsAcceptedCard is true");
      }
      else
      {
        this.jJI = false;
        w.i("MicroMsg.CardBaseShowLogic", "set mIsAcceptedCard is false!");
      }
    }
  }
  
  public boolean aml()
  {
    GMTrace.i(4950352461824L, 36883);
    boolean bool = this.jJJ;
    GMTrace.o(4950352461824L, 36883);
    return bool;
  }
  
  public final boolean amm()
  {
    GMTrace.i(4950486679552L, 36884);
    boolean bool = this.jJK;
    GMTrace.o(4950486679552L, 36884);
    return bool;
  }
  
  public final boolean amn()
  {
    GMTrace.i(4950620897280L, 36885);
    boolean bool = this.jJL;
    GMTrace.o(4950620897280L, 36885);
    return bool;
  }
  
  public final boolean amo()
  {
    GMTrace.i(4950755115008L, 36886);
    boolean bool = this.jJM;
    GMTrace.o(4950755115008L, 36886);
    return bool;
  }
  
  public final boolean amp()
  {
    GMTrace.i(4950889332736L, 36887);
    boolean bool = this.jJN;
    GMTrace.o(4950889332736L, 36887);
    return bool;
  }
  
  public final boolean amq()
  {
    GMTrace.i(4951023550464L, 36888);
    boolean bool = this.jJP;
    GMTrace.o(4951023550464L, 36888);
    return bool;
  }
  
  public final boolean amr()
  {
    GMTrace.i(4951157768192L, 36889);
    boolean bool = this.jJQ;
    GMTrace.o(4951157768192L, 36889);
    return bool;
  }
  
  public final boolean ams()
  {
    GMTrace.i(4951291985920L, 36890);
    boolean bool = this.jJR;
    GMTrace.o(4951291985920L, 36890);
    return bool;
  }
  
  public boolean amt()
  {
    GMTrace.i(4951426203648L, 36891);
    GMTrace.o(4951426203648L, 36891);
    return true;
  }
  
  public boolean amu()
  {
    GMTrace.i(4951560421376L, 36892);
    GMTrace.o(4951560421376L, 36892);
    return false;
  }
  
  public boolean amv()
  {
    GMTrace.i(4951694639104L, 36893);
    GMTrace.o(4951694639104L, 36893);
    return false;
  }
  
  public boolean amw()
  {
    GMTrace.i(4951828856832L, 36894);
    if (((this.jEZ.jtE == 6) && ((!this.jwZ.ajr()) || (this.jwZ.ajs()))) || (this.jEZ.jtE == 5) || ((this.jEZ.jtE == 23) && (this.jwZ.aju())))
    {
      GMTrace.o(4951828856832L, 36894);
      return true;
    }
    GMTrace.o(4951828856832L, 36894);
    return false;
  }
  
  public boolean amx()
  {
    GMTrace.i(4951963074560L, 36895);
    GMTrace.o(4951963074560L, 36895);
    return false;
  }
  
  public boolean amy()
  {
    GMTrace.i(4952097292288L, 36896);
    GMTrace.o(4952097292288L, 36896);
    return true;
  }
  
  public boolean amz()
  {
    GMTrace.i(4952231510016L, 36897);
    if (((amh()) && (amf()) && (amg())) || (this.jJI))
    {
      GMTrace.o(4952231510016L, 36897);
      return true;
    }
    GMTrace.o(4952231510016L, 36897);
    return false;
  }
  
  public final void release()
  {
    GMTrace.i(4949010284544L, 36873);
    this.jwZ = null;
    this.jEZ = null;
    this.iPC = null;
    GMTrace.o(4949010284544L, 36873);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */