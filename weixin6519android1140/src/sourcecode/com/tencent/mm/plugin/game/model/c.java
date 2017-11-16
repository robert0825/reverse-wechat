package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.c.bb;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.LinkedList;

public final class c
  extends f
{
  public String eBv;
  public int eJD;
  public int eSa;
  public String izx;
  public boolean lLA;
  public String lLB;
  public String lLC;
  public String lLD;
  public LinkedList<String> lLE;
  public String lLF;
  public LinkedList<String> lLG;
  public boolean lLH;
  public boolean lLI;
  public String lLJ;
  public String lLK;
  public String lLL;
  public String lLM;
  public String lLN;
  public boolean lLO;
  public String lLP;
  public long lLQ;
  public int lLR;
  public bb lLS;
  public String lLv;
  public String lLw;
  public String lLx;
  public String lLy;
  public String lLz;
  public String name;
  public int position;
  public int scene;
  public int status;
  public int type;
  public int versionCode;
  
  public c()
  {
    GMTrace.i(12610963505152L, 93959);
    this.status = 0;
    this.type = 0;
    this.lLv = "";
    this.lLw = "";
    this.lLx = "#929292";
    this.lLy = "";
    this.lLz = "";
    this.eBv = "";
    this.lLA = false;
    this.scene = 0;
    this.eSa = 0;
    this.position = 1;
    this.versionCode = 0;
    this.lLB = "";
    this.lLC = "";
    this.lLD = "";
    this.lLE = new LinkedList();
    this.lLF = "";
    this.lLG = new LinkedList();
    this.lLH = false;
    this.lLI = false;
    this.lLJ = "";
    this.lLK = "#fca28a";
    this.lLL = "";
    this.izx = "";
    this.name = "";
    this.lLM = "#222222";
    this.lLN = "";
    this.lLO = false;
    this.lLP = "";
    this.lLQ = 0L;
    this.eJD = 0;
    this.lLR = 0;
    GMTrace.o(12610963505152L, 93959);
  }
  
  public final boolean aFb()
  {
    GMTrace.i(15198412865536L, 113237);
    if (((this.lLR == 1) || (this.lLR == 2)) && (this.lLS != null) && (!bg.nm(this.lLS.lRS)))
    {
      GMTrace.o(15198412865536L, 113237);
      return true;
    }
    GMTrace.o(15198412865536L, 113237);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */