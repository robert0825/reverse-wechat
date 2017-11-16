package com.tencent.mm.compatible.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class a
{
  public int fNA;
  public int fNB;
  public int fNC;
  public int fND;
  public int fNE;
  public int fNF;
  public int fNG;
  public int fNH;
  public int fNI;
  public int fNJ;
  public int fNK;
  public int fNL;
  public int fNM;
  public int fNN;
  public int fNO;
  public int fNP;
  public int fNQ;
  public int fNR;
  public int fNS;
  public boolean fNT;
  public int fNU;
  public int fNV;
  public int fNW;
  public int fNX;
  public int fNY;
  public int fNZ;
  public boolean fNp;
  public int fNq;
  public int fNr;
  public int fNs;
  public int fNt;
  public int fNu;
  public int fNv;
  public int fNw;
  public int fNx;
  public int fNy;
  public int fNz;
  public int fOa;
  public int fOb;
  public int fOc;
  public int fOd;
  public int fOe;
  public int fOf;
  public int fOg;
  public int fOh;
  public int fOi;
  public short[] fOj;
  public short[] fOk;
  public boolean fOl;
  public int fOm;
  public boolean fOn;
  public int fOo;
  public int fOp;
  public int fOq;
  public int fOr;
  public int fOs;
  public int fOt;
  public int fOu;
  public int fOv;
  public int fOw;
  public int fOx;
  
  public a()
  {
    GMTrace.i(13807782985728L, 102876);
    this.fNp = false;
    this.fOj = new short[15];
    this.fOk = new short[2];
    this.fOn = false;
    reset();
    GMTrace.o(13807782985728L, 102876);
  }
  
  public final void dump()
  {
    GMTrace.i(13809259380736L, 102887);
    w.d("VoipAudioInfo", "streamtype " + this.fNq);
    w.d("VoipAudioInfo", "smode " + this.fNr);
    w.d("VoipAudioInfo", "omode " + this.fNs);
    w.d("VoipAudioInfo", "ospeaker " + this.fNt);
    w.d("VoipAudioInfo", "operating" + this.fNu);
    w.d("VoipAudioInfo", "moperating" + this.fNv);
    w.d("VoipAudioInfo", "mstreamtype" + this.fNw);
    w.d("VoipAudioInfo", "mVoiceRecordMode" + this.fNx);
    w.d("VoipAudioInfo", "agcMode :" + this.fOb);
    w.d("VoipAudioInfo", "nsMode:" + this.fNA);
    w.d("VoipAudioInfo", "aecMode:" + this.fNz);
    w.d("VoipAudioInfo", "volumMode:" + this.fNB);
    w.d("VoipAudioInfo", "micMode:" + this.fNM);
    w.d("VoipAudioInfo", "sourceMode:" + this.fNN);
    w.d("VoipAudioInfo", "speakerMode:" + this.fNO);
    w.d("VoipAudioInfo", "phoneMode:" + this.fNP);
    w.d("VoipAudioInfo", "voipstreamType:" + this.fNQ);
    w.d("VoipAudioInfo", "speakerstreamtype:" + this.fNR);
    w.d("VoipAudioInfo", "phonestreamtype:" + this.fNS);
    w.d("VoipAudioInfo", "ringphonestream:" + this.fNU);
    w.d("VoipAudioInfo", "ringphonemode:" + this.fNV);
    w.d("VoipAudioInfo", "ringspeakerstream:" + this.fNW);
    w.d("VoipAudioInfo", "ringspeakermode:" + this.fNX);
    w.d("VoipAudioInfo", "agcModeNew :" + this.fOa);
    w.d("VoipAudioInfo", "nsModeNew:" + this.fNZ);
    w.d("VoipAudioInfo", "aecModeNew:" + this.fNY);
    w.d("VoipAudioInfo", "agctargetdb:" + this.fOc);
    w.d("VoipAudioInfo", "agcgaindb:" + this.fOd);
    w.d("VoipAudioInfo", "agcflag:" + this.fOe);
    w.d("VoipAudioInfo", "agclimiter:" + this.fOf);
    w.d("VoipAudioInfo", "inputVolumeScale:" + this.fNC);
    w.d("VoipAudioInfo", "outputVolumeScale:" + this.fND);
    w.d("VoipAudioInfo", "inputVolumeScaleForSpeaker:" + this.fNE);
    w.d("VoipAudioInfo", "outputVolumeScaleForSpeaker:" + this.fNF);
    w.d("VoipAudioInfo", "ehanceHeadsetEC:" + this.fNI);
    w.d("VoipAudioInfo", "setECModeLevelForHeadSet:" + this.fNJ);
    w.d("VoipAudioInfo", "setECModeLevelForSpeaker:" + this.fNK);
    w.d("VoipAudioInfo", "enableSpeakerEnhanceEC:" + this.fNL);
    w.d("VoipAudioInfo", "enableRecTimer:" + this.fOg);
    w.d("VoipAudioInfo", "enablePlayTimer:" + this.fOh);
    w.d("VoipAudioInfo", "setPlayerPrecorrectCofOnOrOff:" + this.fOi);
    w.d("VoipAudioInfo", "outputVolumeGainForPhone:" + this.fNG);
    w.d("VoipAudioInfo", "outputVolumeGainForSpeaker:" + this.fNH);
    w.d("VoipAudioInfo", "noisegateon" + this.fOl);
    w.d("VoipAudioInfo", "noisegatestrength[0]" + this.fOk[0]);
    w.d("VoipAudioInfo", "noisegatestrength[1]" + this.fOk[1]);
    w.d("VoipAudioInfo", "spkecenable:" + this.fOm);
    w.d("VoipAudioInfo", "agcRxFlag:" + this.fOu);
    w.d("VoipAudioInfo", "agcRxTargetdb:" + this.fOv);
    w.d("VoipAudioInfo", "agcRxGaindb:" + this.fOw);
    w.d("VoipAudioInfo", "agcRxLimiter:" + this.fOx);
    GMTrace.o(13809259380736L, 102887);
  }
  
  public final void reset()
  {
    GMTrace.i(13807917203456L, 102877);
    this.fNp = false;
    this.fNq = -1;
    this.fNr = -1;
    this.fNs = -1;
    this.fNt = -1;
    this.fNu = -1;
    this.fNv = -1;
    this.fNw = -1;
    this.fNy = -1;
    this.fNx = -1;
    this.fOb = -1;
    this.fNz = -1;
    this.fNA = -1;
    this.fNB = -1;
    this.fNM = -1;
    this.fNN = -1;
    this.fNO = -1;
    this.fNP = -1;
    this.fNQ = -1;
    this.fNR = -1;
    this.fNS = -1;
    this.fNT = false;
    this.fNU = -1;
    this.fNV = -1;
    this.fNX = -1;
    this.fNW = -1;
    this.fOa = -1;
    this.fNY = -1;
    this.fNZ = -1;
    this.fOc = -1;
    this.fOd = -1;
    this.fOe = -1;
    this.fOf = -1;
    this.fNC = -1;
    this.fND = -1;
    this.fNE = -1;
    this.fNF = -1;
    this.fNI = -1;
    this.fNJ = -1;
    this.fNK = -1;
    this.fNL = -1;
    this.fOg = 0;
    this.fOh = 0;
    this.fOi = -1;
    this.fNH = -1;
    this.fNG = -1;
    this.fOl = false;
    this.fOk[0] = -1;
    this.fOk[1] = -1;
    this.fOm = -1;
    this.fOu = -1;
    this.fOv = -1;
    this.fOw = -1;
    this.fOx = -1;
    GMTrace.o(13807917203456L, 102877);
  }
  
  public final boolean sA()
  {
    GMTrace.i(13808588292096L, 102882);
    if (sx())
    {
      int i = this.fNu & 0x10;
      StringBuilder localStringBuilder = new StringBuilder("enableSpeaker ");
      if (i > 0) {}
      for (boolean bool = true;; bool = false)
      {
        w.d("VoipAudioInfo", bool);
        if (i <= 0) {
          break;
        }
        GMTrace.o(13808588292096L, 102882);
        return true;
      }
      GMTrace.o(13808588292096L, 102882);
      return false;
    }
    GMTrace.o(13808588292096L, 102882);
    return false;
  }
  
  public final int sB()
  {
    GMTrace.i(13808722509824L, 102883);
    if (sx())
    {
      int i = (this.fNu & 0xE) >> 1;
      w.d("VoipAudioInfo", "getDisableMode " + i);
      if (i == 7)
      {
        GMTrace.o(13808722509824L, 102883);
        return -1;
      }
      GMTrace.o(13808722509824L, 102883);
      return i;
    }
    GMTrace.o(13808722509824L, 102883);
    return -1;
  }
  
  public final boolean sC()
  {
    GMTrace.i(13808856727552L, 102884);
    if (sx())
    {
      int i = this.fNu & 0x1;
      StringBuilder localStringBuilder = new StringBuilder("disableSpeaker ");
      if (i > 0) {}
      for (boolean bool = true;; bool = false)
      {
        w.d("VoipAudioInfo", bool);
        if (i <= 0) {
          break;
        }
        GMTrace.o(13808856727552L, 102884);
        return true;
      }
      GMTrace.o(13808856727552L, 102884);
      return false;
    }
    GMTrace.o(13808856727552L, 102884);
    return false;
  }
  
  public final int sD()
  {
    GMTrace.i(13808990945280L, 102885);
    if (sy())
    {
      int i = (this.fNv & 0xE0) >> 5;
      w.d("VoipAudioInfo", "getEnableMode " + i);
      if (i == 7)
      {
        GMTrace.o(13808990945280L, 102885);
        return -1;
      }
      GMTrace.o(13808990945280L, 102885);
      return i;
    }
    GMTrace.o(13808990945280L, 102885);
    return -1;
  }
  
  public final int sE()
  {
    GMTrace.i(13809125163008L, 102886);
    if (sy())
    {
      int i = (this.fNv & 0xE) >> 1;
      w.d("VoipAudioInfo", "getDisableMode " + i);
      if (i == 7)
      {
        GMTrace.o(13809125163008L, 102886);
        return -1;
      }
      GMTrace.o(13809125163008L, 102886);
      return i;
    }
    GMTrace.o(13809125163008L, 102886);
    return -1;
  }
  
  public final boolean sw()
  {
    GMTrace.i(13808051421184L, 102878);
    if (((this.fNr >= 0) && (this.fNs < 0)) || ((this.fNr < 0) && (this.fNs >= 0)) || (this.fNt > 0))
    {
      GMTrace.o(13808051421184L, 102878);
      return true;
    }
    GMTrace.o(13808051421184L, 102878);
    return false;
  }
  
  public final boolean sx()
  {
    GMTrace.i(13808185638912L, 102879);
    if (this.fNu >= 0)
    {
      GMTrace.o(13808185638912L, 102879);
      return true;
    }
    GMTrace.o(13808185638912L, 102879);
    return false;
  }
  
  public final boolean sy()
  {
    GMTrace.i(13808319856640L, 102880);
    if (this.fNv >= 0)
    {
      GMTrace.o(13808319856640L, 102880);
      return true;
    }
    GMTrace.o(13808319856640L, 102880);
    return false;
  }
  
  public final int sz()
  {
    GMTrace.i(13808454074368L, 102881);
    if (sx())
    {
      int i = (this.fNu & 0xE0) >> 5;
      w.d("VoipAudioInfo", "getEnableMode " + i);
      if (i == 7)
      {
        GMTrace.o(13808454074368L, 102881);
        return -1;
      }
      GMTrace.o(13808454074368L, 102881);
      return i;
    }
    GMTrace.o(13808454074368L, 102881);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\compatible\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */