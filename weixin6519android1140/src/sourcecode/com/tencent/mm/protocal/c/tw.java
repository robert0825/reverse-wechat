package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class tw
  extends com.tencent.mm.bm.a
{
  public String appId;
  public String eAr;
  public int eDi;
  public String eMI;
  public String eQB;
  public String eVH;
  public boolean gHl;
  public String gVf;
  public long hcs;
  public String toUser;
  public boolean ukW;
  public boolean ukX;
  public boolean ukY;
  public String ulI;
  public boolean ulJ;
  public String ulb;
  public boolean ulc;
  public boolean uld;
  public boolean ule;
  public boolean ulf;
  public boolean ulg;
  public String ulh;
  public boolean uli;
  public boolean ulj;
  
  public tw()
  {
    GMTrace.i(3675418263552L, 27384);
    this.ukW = false;
    this.ukX = false;
    this.ukY = false;
    this.ulJ = false;
    this.ulc = false;
    this.gHl = false;
    this.uld = false;
    this.ule = false;
    this.ulf = false;
    this.ulg = false;
    this.uli = false;
    this.ulj = false;
    GMTrace.o(3675418263552L, 27384);
  }
  
  public final tw QY(String paramString)
  {
    GMTrace.i(3675686699008L, 27386);
    this.eMI = paramString;
    this.ukX = true;
    GMTrace.o(3675686699008L, 27386);
    return this;
  }
  
  public final tw QZ(String paramString)
  {
    GMTrace.i(3675820916736L, 27387);
    this.toUser = paramString;
    this.ukY = true;
    GMTrace.o(3675820916736L, 27387);
    return this;
  }
  
  public final tw Ra(String paramString)
  {
    GMTrace.i(3675955134464L, 27388);
    this.ulI = paramString;
    this.ulJ = true;
    GMTrace.o(3675955134464L, 27388);
    return this;
  }
  
  public final tw Rb(String paramString)
  {
    GMTrace.i(3676089352192L, 27389);
    this.ulb = paramString;
    this.ulc = true;
    GMTrace.o(3676089352192L, 27389);
    return this;
  }
  
  public final tw Rc(String paramString)
  {
    GMTrace.i(3676357787648L, 27391);
    this.eQB = paramString;
    this.uld = true;
    GMTrace.o(3676357787648L, 27391);
    return this;
  }
  
  public final tw Rd(String paramString)
  {
    GMTrace.i(3676492005376L, 27392);
    this.eVH = paramString;
    this.ule = true;
    GMTrace.o(3676492005376L, 27392);
    return this;
  }
  
  public final tw Re(String paramString)
  {
    GMTrace.i(3676626223104L, 27393);
    this.appId = paramString;
    this.ulf = true;
    GMTrace.o(3676626223104L, 27393);
    return this;
  }
  
  public final tw Rf(String paramString)
  {
    GMTrace.i(3676760440832L, 27394);
    this.gVf = paramString;
    this.ulg = true;
    GMTrace.o(3676760440832L, 27394);
    return this;
  }
  
  public final tw Rg(String paramString)
  {
    GMTrace.i(3676894658560L, 27395);
    this.eAr = paramString;
    this.ulj = true;
    GMTrace.o(3676894658560L, 27395);
    return this;
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3677028876288L, 27396);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (!this.ukW) {
        throw new b("Not all required fields were included: sourceType");
      }
      if (this.ukW == true) {
        paramVarArgs.fk(1, this.eDi);
      }
      if (this.eMI != null) {
        paramVarArgs.e(2, this.eMI);
      }
      if (this.toUser != null) {
        paramVarArgs.e(3, this.toUser);
      }
      if (this.ulI != null) {
        paramVarArgs.e(4, this.ulI);
      }
      if (this.ulb != null) {
        paramVarArgs.e(5, this.ulb);
      }
      if (this.gHl == true) {
        paramVarArgs.T(6, this.hcs);
      }
      if (this.eQB != null) {
        paramVarArgs.e(7, this.eQB);
      }
      if (this.eVH != null) {
        paramVarArgs.e(8, this.eVH);
      }
      if (this.appId != null) {
        paramVarArgs.e(9, this.appId);
      }
      if (this.gVf != null) {
        paramVarArgs.e(10, this.gVf);
      }
      if (this.ulh != null) {
        paramVarArgs.e(11, this.ulh);
      }
      if (this.eAr != null) {
        paramVarArgs.e(12, this.eAr);
      }
      GMTrace.o(3677028876288L, 27396);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ukW != true) {
        break label1070;
      }
    }
    label1070:
    for (int i = b.a.a.a.fh(1, this.eDi) + 0;; i = 0)
    {
      paramInt = i;
      if (this.eMI != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.eMI);
      }
      i = paramInt;
      if (this.toUser != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.toUser);
      }
      paramInt = i;
      if (this.ulI != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.ulI);
      }
      i = paramInt;
      if (this.ulb != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.ulb);
      }
      paramInt = i;
      if (this.gHl == true) {
        paramInt = i + b.a.a.a.S(6, this.hcs);
      }
      i = paramInt;
      if (this.eQB != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.eQB);
      }
      paramInt = i;
      if (this.eVH != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.eVH);
      }
      i = paramInt;
      if (this.appId != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.appId);
      }
      paramInt = i;
      if (this.gVf != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.gVf);
      }
      i = paramInt;
      if (this.ulh != null) {
        i = paramInt + b.a.a.b.b.a.f(11, this.ulh);
      }
      paramInt = i;
      if (this.eAr != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.eAr);
      }
      GMTrace.o(3677028876288L, 27396);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (!this.ukW) {
          throw new b("Not all required fields were included: sourceType");
        }
        GMTrace.o(3677028876288L, 27396);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        tw localtw = (tw)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3677028876288L, 27396);
          return -1;
        case 1: 
          localtw.eDi = locala.yqV.nj();
          localtw.ukW = true;
          GMTrace.o(3677028876288L, 27396);
          return 0;
        case 2: 
          localtw.eMI = locala.yqV.readString();
          localtw.ukX = true;
          GMTrace.o(3677028876288L, 27396);
          return 0;
        case 3: 
          localtw.toUser = locala.yqV.readString();
          localtw.ukY = true;
          GMTrace.o(3677028876288L, 27396);
          return 0;
        case 4: 
          localtw.ulI = locala.yqV.readString();
          localtw.ulJ = true;
          GMTrace.o(3677028876288L, 27396);
          return 0;
        case 5: 
          localtw.ulb = locala.yqV.readString();
          localtw.ulc = true;
          GMTrace.o(3677028876288L, 27396);
          return 0;
        case 6: 
          localtw.hcs = locala.yqV.nk();
          localtw.gHl = true;
          GMTrace.o(3677028876288L, 27396);
          return 0;
        case 7: 
          localtw.eQB = locala.yqV.readString();
          localtw.uld = true;
          GMTrace.o(3677028876288L, 27396);
          return 0;
        case 8: 
          localtw.eVH = locala.yqV.readString();
          localtw.ule = true;
          GMTrace.o(3677028876288L, 27396);
          return 0;
        case 9: 
          localtw.appId = locala.yqV.readString();
          localtw.ulf = true;
          GMTrace.o(3677028876288L, 27396);
          return 0;
        case 10: 
          localtw.gVf = locala.yqV.readString();
          localtw.ulg = true;
          GMTrace.o(3677028876288L, 27396);
          return 0;
        case 11: 
          localtw.ulh = locala.yqV.readString();
          localtw.uli = true;
          GMTrace.o(3677028876288L, 27396);
          return 0;
        }
        localtw.eAr = locala.yqV.readString();
        localtw.ulj = true;
        GMTrace.o(3677028876288L, 27396);
        return 0;
      }
      GMTrace.o(3677028876288L, 27396);
      return -1;
    }
  }
  
  public final tw eE(long paramLong)
  {
    GMTrace.i(3676223569920L, 27390);
    this.hcs = paramLong;
    this.gHl = true;
    GMTrace.o(3676223569920L, 27390);
    return this;
  }
  
  public final tw zZ(int paramInt)
  {
    GMTrace.i(3675552481280L, 27385);
    this.eDi = paramInt;
    this.ukW = true;
    GMTrace.o(3675552481280L, 27385);
    return this;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\tw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */