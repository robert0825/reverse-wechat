package com.tencent.mm.compatible.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class j
{
  public int fPA;
  public int fPB;
  public int fPC;
  public int fPD;
  public int fPE;
  public int fPF;
  public int fPG;
  public int fPH;
  public int fPI;
  public int fPJ;
  public int fPK;
  public int fPL;
  public double fPM;
  public int fPN;
  public int fPO;
  public int fPP;
  public int fPQ;
  public String fPR;
  public String fPS;
  public String fPT;
  public String fPU;
  public String fPV;
  public String fPW;
  public String fPX;
  public String fPY;
  public String fPZ;
  public int fPk;
  public int fPl;
  public int fPm;
  public int fPn;
  public int fPo;
  public int fPp;
  public int fPq;
  public int fPr;
  public boolean fPs;
  public int fPt;
  public int fPu;
  public int fPv;
  public int fPw;
  public int fPx;
  public int fPy;
  public int fPz;
  public String fQa;
  public String fQb;
  public String fQc;
  public String fQd;
  public int fQe;
  public int fQf;
  public int fQg;
  public int fQh;
  public int fQi;
  
  public j()
  {
    GMTrace.i(13809796251648L, 102891);
    this.fPk = -1;
    this.fPl = -1;
    this.fPm = -1;
    this.fPn = -1;
    this.fPo = -1;
    this.fPp = -1;
    this.fPq = -1;
    this.fPr = -1;
    this.fPs = false;
    this.fPt = -1;
    this.fPu = -1;
    this.fPv = -1;
    this.fPw = -1;
    this.fPx = -1;
    this.fPy = -1;
    this.fPz = -1;
    this.fPA = -1;
    this.fPB = -1;
    this.fPC = -1;
    this.fPD = -1;
    this.fPE = -1;
    this.fPF = -1;
    this.fPG = -1;
    this.fPH = -1;
    this.fPI = -1;
    this.fPJ = -1;
    this.fPK = -1;
    this.fPL = -1;
    this.fPM = -1.0D;
    this.fPN = -1;
    this.fPO = -1;
    this.fPP = -1;
    this.fPQ = -1;
    this.fPR = null;
    this.fPS = null;
    this.fPT = null;
    this.fPU = null;
    this.fPV = null;
    this.fPW = null;
    this.fPX = null;
    this.fPY = null;
    this.fPZ = null;
    this.fQa = null;
    this.fQb = null;
    this.fQc = null;
    this.fQd = null;
    this.fQe = -1;
    this.fQf = 2;
    this.fQg = 1;
    this.fQh = 1;
    this.fQi = -1;
    reset();
    GMTrace.o(13809796251648L, 102891);
  }
  
  public final void dump()
  {
    GMTrace.i(13810064687104L, 102893);
    w.d("MicroMsg.CommonInfo", "js " + this.fPk);
    w.d("MicroMsg.CommonInfo", "stopBluetoothInBR " + this.fPl);
    w.d("MicroMsg.CommonInfo", "stopBluetoothInBU " + this.fPm);
    w.d("MicroMsg.CommonInfo", "setBluetoothScoOn " + this.fPo);
    w.d("MicroMsg.CommonInfo", "startBluetoothSco " + this.fPn);
    w.d("MicroMsg.CommonInfo", "voiceSearchFastMode " + this.fPp);
    w.d("MicroMsg.CommonInfo", "pcmReadMode " + this.fPr);
    w.d("MicroMsg.CommonInfo", "pcmBufferRate " + this.fPq);
    w.d("MicroMsg.CommonInfo", "audioPrePro " + this.fPu);
    w.d("MicroMsg.CommonInfo", "voicemsgfd " + this.fPv);
    w.d("MicroMsg.CommonInfo", "htcvoicemode " + this.fPw);
    w.d("MicroMsg.CommonInfo", "samsungvoicemode " + this.fPx);
    w.d("MicroMsg.CommonInfo", "speexBufferRate " + this.fPy);
    w.d("MicroMsg.CommonInfo", "linespe " + this.fPz);
    w.d("MicroMsg.CommonInfo", "fixspan " + this.fPK);
    w.d("MicroMsg.CommonInfo", "extvideo " + this.fPA);
    w.d("MicroMsg.CommonInfo", "extvideosam " + this.fPB);
    w.d("MicroMsg.CommonInfo", "sysvideodegree " + this.fPC);
    w.d("MicroMsg.CommonInfo", "mmnotify " + this.fPF);
    w.d("MicroMsg.CommonInfo", "extsharevcard " + this.fPE);
    w.d("MicroMsg.CommonInfo", "audioformat " + this.fPG);
    w.d("MicroMsg.CommonInfo", "qrcam " + this.fPH);
    w.d("MicroMsg.CommonInfo", "mBase " + this.fPR);
    w.d("MicroMsg.CommonInfo", "mPackageInfo " + this.fPS);
    w.d("MicroMsg.CommonInfo", "mClassLoader " + this.fPT);
    w.d("MicroMsg.CommonInfo", "mResources " + this.fPU);
    w.d("MicroMsg.CommonInfo", "sysvideofp " + this.fPI);
    w.d("MicroMsg.CommonInfo", "extstoragedir " + this.fPV);
    w.d("MicroMsg.CommonInfo", "extpubdir " + this.fPW);
    w.d("MicroMsg.CommonInfo", "extdatadir " + this.fPX);
    w.d("MicroMsg.CommonInfo", "extrootdir " + this.fPY);
    w.d("MicroMsg.CommonInfo", "extstoragestate " + this.fPZ);
    w.d("MicroMsg.CommonInfo", "extcachedir " + this.fQa);
    w.d("MicroMsg.CommonInfo", "extvideoplayer " + this.fPJ);
    w.d("MicroMsg.CommonInfo", "loadDrawable " + this.fQb);
    w.d("MicroMsg.CommonInfo", "loadXmlResourceParser " + this.fQc);
    w.d("MicroMsg.CommonInfo", "voipAudioPrePro " + this.fPN);
    w.d("MicroMsg.CommonInfo", "voipAudioPreProNS " + this.fPO);
    w.d("MicroMsg.CommonInfo", "voipAudioPreProAEC " + this.fPP);
    w.d("MicroMsg.CommonInfo", "voipAudioPreProAGC " + this.fPQ);
    w.d("MicroMsg.CommonInfo", "sight full screen type " + this.fQd);
    w.d("MicroMsg.CommonInfo", "checkSightDraftMd5 " + this.fQf);
    w.d("MicroMsg.CommonInfo", "swipeBackConfig " + this.fQg);
    w.d("MicroMsg.CommonInfo", "qrCodeZoom " + this.fPL);
    GMTrace.o(13810064687104L, 102893);
  }
  
  public final void reset()
  {
    GMTrace.i(13809930469376L, 102892);
    this.fPk = -1;
    this.fPl = -1;
    this.fPm = -1;
    this.fPn = -1;
    this.fPo = -1;
    this.fPp = -1;
    this.fPr = -1;
    this.fPq = -1;
    this.fPu = -1;
    this.fPv = -1;
    this.fPw = -1;
    this.fPx = -1;
    this.fPs = false;
    this.fPt = -1;
    this.fPy = -1;
    this.fPz = -1;
    this.fPA = -1;
    this.fPB = -1;
    this.fPC = -1;
    this.fPF = -1;
    this.fPE = -1;
    this.fPG = -1;
    this.fPH = -1;
    this.fPD = -1;
    this.fPG = -1;
    this.fPH = -1;
    this.fPK = -1;
    this.fPN = -1;
    this.fPO = -1;
    this.fPP = -1;
    this.fPQ = -1;
    this.fPR = null;
    this.fPS = null;
    this.fPT = null;
    this.fPU = null;
    this.fPI = -1;
    this.fPV = null;
    this.fPW = null;
    this.fPX = null;
    this.fPY = null;
    this.fPZ = null;
    this.fQa = null;
    this.fPJ = -1;
    this.fQb = null;
    this.fQc = null;
    this.fQd = null;
    this.fQe = -1;
    this.fQf = 2;
    this.fQg = 1;
    this.fQh = 1;
    this.fPL = -1;
    GMTrace.o(13809930469376L, 102892);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\compatible\d\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */