package com.tencent.mm.plugin.sns.a.b;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.storage.b;
import com.tencent.mm.protocal.c.be;
import com.tencent.mm.protocal.c.bfh;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class a
{
  long gVt;
  public String gVu;
  private String hTy;
  boolean jAg;
  public int kKE;
  public int nvM;
  public boolean pmA;
  public bfh pmB;
  public View pmC;
  public View pmD;
  public int pmE;
  public int pmF;
  public int pmG;
  private View pmH;
  private int pmI;
  private com.tencent.mm.plugin.sns.storage.a pmJ;
  b pmK;
  int pmL;
  private int pmM;
  int pmN;
  private int pmO;
  long pmP;
  long pmQ;
  private int pmR;
  private int pmS;
  long pmT;
  private int pmU;
  private int pmV;
  long pmW;
  private int pmX;
  private int pmY;
  long pmZ;
  private int pna;
  private int pnb;
  long pnc;
  int pnd;
  int pne;
  int pnf;
  int png;
  int pnh;
  int position;
  
  public a(com.tencent.mm.plugin.sns.storage.a parama, long paramLong, View paramView1, int paramInt1, View paramView2, int paramInt2, int paramInt3, bfh parambfh, int paramInt4, b paramb)
  {
    GMTrace.i(20053068087296L, 149407);
    this.pmA = false;
    this.nvM = 1;
    this.position = 0;
    this.pmE = 0;
    this.kKE = 0;
    this.pmF = 0;
    this.pmI = 0;
    this.gVu = "";
    this.gVt = 0L;
    this.pmJ = null;
    this.hTy = "";
    this.pmL = 55450;
    this.pmM = 55450;
    this.pmN = 55450;
    this.pmO = 55450;
    this.pmP = 0L;
    this.pmQ = 0L;
    this.pmR = 55450;
    this.pmS = 55450;
    this.pmT = 0L;
    this.pmU = 55450;
    this.pmV = 55450;
    this.pmW = 0L;
    this.pmX = 55450;
    this.pmY = 55450;
    this.pmZ = 0L;
    this.pna = 55450;
    this.pnb = 55450;
    this.pnc = 0L;
    this.pnd = 0;
    this.pne = -1;
    this.pnf = -1;
    this.png = 0;
    this.pnh = 0;
    this.jAg = false;
    this.position = paramInt4;
    this.pmC = paramView1;
    this.pmB = parambfh;
    this.pmK = paramb;
    this.pmJ = parama;
    this.nvM = paramInt3;
    if (parama == null)
    {
      paramView1 = "";
      this.hTy = paramView1;
      if (parama != null) {
        break label345;
      }
    }
    label345:
    for (parama = "";; parama = bg.aq(parama.pyc, ""))
    {
      this.gVu = parama;
      this.gVt = paramLong;
      this.pmG = paramInt1;
      this.pmH = paramView2;
      this.pmI = paramInt2;
      if (this.pmC != null) {
        this.pmD = this.pmC.findViewById(i.f.oZL);
      }
      MP();
      GMTrace.o(20053068087296L, 149407);
      return;
      paramView1 = bg.aq(parama.hTy, "");
      break;
    }
  }
  
  private void MP()
  {
    GMTrace.i(8163659087872L, 60824);
    if (this.kKE == 0)
    {
      BackwardSupportUtil.b.a(this.pmC.getContext(), 50.0F);
      this.kKE = this.pmC.getHeight();
      if (this.pmD != null) {
        this.pmE = this.pmD.getHeight();
      }
      if (this.kKE == 0)
      {
        GMTrace.o(8163659087872L, 60824);
        return;
      }
      int i = 0;
      if (this.pmH != null) {
        i = this.pmH.getBottom();
      }
      this.kKE -= this.pmE;
      this.pmF = (this.kKE / 2);
      this.pmG = (this.pmG - i - this.pmI);
      w.i("MicroMsg.AdViewStatic", "viewHeight " + this.kKE + " SCREEN_HEIGHT: " + this.pmG + " abottom: " + i + " stHeight: " + this.pmI + " commentViewHeight:" + this.pmE);
    }
    GMTrace.o(8163659087872L, 60824);
  }
  
  public final void bhE()
  {
    int j = 1;
    GMTrace.i(8163793305600L, 60825);
    int m;
    int k;
    int n;
    int i1;
    if (this.pmC != null)
    {
      MP();
      if ((this.jAg) || (this.kKE <= 0))
      {
        GMTrace.o(8163793305600L, 60825);
        return;
      }
      this.pmA = true;
      m = this.pmC.getTop();
      k = this.pmC.getBottom() - this.pmE;
      if ((this.pmL == 55450) && (this.pmM == 55450))
      {
        this.pmL = m;
        this.pmM = k;
      }
      this.pmN = m;
      this.pmO = k;
      if (m < 0)
      {
        n = m + this.kKE;
        i1 = this.kKE - n;
        if ((n < this.pmF) || (this.pmR != 55450)) {
          break label840;
        }
        this.pmR = m;
        this.pmS = k;
        this.pmT = System.currentTimeMillis();
        w.i("MicroMsg.AdViewStatic", "up first touch half" + n + " top " + m + " viewhieght " + this.kKE + " inscreenval: " + n + " outscreenval: " + i1);
      }
    }
    label683:
    label824:
    label832:
    label840:
    for (int i = 0;; i = 1)
    {
      if ((i1 >= this.pmF) && (this.pmU == 55450) && (i != 0) && (this.pmT > 0L))
      {
        this.pmU = m;
        this.pmV = k;
        this.pmW = System.currentTimeMillis();
        w.i("MicroMsg.AdViewStatic", "down first touch half" + n + " bottom " + k + " viewhieght " + this.kKE + " inscreenval: " + n + " outscreenval: " + i1);
      }
      if (k > this.pmG)
      {
        n = k - this.pmG;
        i1 = this.kKE - n;
        i = j;
        if (i1 >= this.pmF)
        {
          i = j;
          if (this.pmR == 55450)
          {
            this.pmR = m;
            this.pmS = k;
            this.pmT = System.currentTimeMillis();
            w.i("MicroMsg.AdViewStatic", "up first touch half" + n + " top " + m + " viewhieght " + this.kKE + " inscreenval: " + i1 + " outscreenval: " + n);
            i = 0;
          }
        }
        if ((n >= this.pmF) && (this.pmU == 55450) && (i != 0) && (this.pmT > 0L))
        {
          this.pmU = m;
          this.pmV = k;
          this.pmW = System.currentTimeMillis();
          w.i("MicroMsg.AdViewStatic", "down first touch half" + n + " bottom " + k + " viewhieght " + this.kKE + " inscreenval: " + i1 + " outscreenval: " + n);
        }
      }
      if ((m >= 0) && (k <= this.pmG))
      {
        if (this.pmZ == 0L)
        {
          this.pmX = m;
          this.pmY = k;
          this.pmZ = System.currentTimeMillis();
        }
        if (m >= 0) {
          break label824;
        }
        i = -m;
        if ((this.pne == -1) || (this.pne > i)) {
          this.pne = i;
        }
        if (k <= this.pmG) {
          break label832;
        }
        i = k - this.pmG;
        if ((this.pnf != -1) && (this.pnf <= i)) {}
      }
      for (this.pnf = i;; this.pnf = 0)
      {
        j = this.kKE;
        i = j;
        if (m < 0) {
          i = j + m;
        }
        j = i;
        if (k > this.pmG) {
          j = i - (k - this.pmG);
        }
        if ((this.pnd == -1) || (this.pnd < j)) {
          this.pnd = j;
        }
        GMTrace.o(8163793305600L, 60825);
        return;
        if ((this.pnc != 0L) || (this.pmZ == 0L)) {
          break;
        }
        this.pna = m;
        this.pnb = k;
        this.pnc = System.currentTimeMillis();
        break;
        this.pne = 0;
        break label683;
      }
    }
  }
  
  public final be bhF()
  {
    GMTrace.i(8163927523328L, 60826);
    be localbe = new be();
    if (this.pmB != null)
    {
      localbe.tPw = this.pmB.uQR;
      localbe.bKc = this.pmB.uQO;
      GMTrace.o(8163927523328L, 60826);
      return localbe;
    }
    GMTrace.o(8163927523328L, 60826);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\a\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */