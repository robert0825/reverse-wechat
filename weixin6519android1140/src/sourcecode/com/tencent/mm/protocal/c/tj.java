package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class tj
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
  public String ukZ;
  public boolean ula;
  public String ulb;
  public boolean ulc;
  public boolean uld;
  public boolean ule;
  public boolean ulf;
  public boolean ulg;
  public String ulh;
  public boolean uli;
  public boolean ulj;
  
  public tj()
  {
    GMTrace.i(3624952397824L, 27008);
    this.ukW = false;
    this.ukX = false;
    this.ukY = false;
    this.ula = false;
    this.ulc = false;
    this.gHl = false;
    this.uld = false;
    this.ule = false;
    this.ulf = false;
    this.ulg = false;
    this.uli = false;
    this.ulj = false;
    GMTrace.o(3624952397824L, 27008);
  }
  
  public final tj QH(String paramString)
  {
    GMTrace.i(3625220833280L, 27010);
    this.eMI = paramString;
    this.ukX = true;
    GMTrace.o(3625220833280L, 27010);
    return this;
  }
  
  public final tj QI(String paramString)
  {
    GMTrace.i(3625355051008L, 27011);
    this.toUser = paramString;
    this.ukY = true;
    GMTrace.o(3625355051008L, 27011);
    return this;
  }
  
  public final tj QJ(String paramString)
  {
    GMTrace.i(3625489268736L, 27012);
    this.ukZ = paramString;
    this.ula = true;
    GMTrace.o(3625489268736L, 27012);
    return this;
  }
  
  public final tj QK(String paramString)
  {
    GMTrace.i(3625623486464L, 27013);
    this.ulb = paramString;
    this.ulc = true;
    GMTrace.o(3625623486464L, 27013);
    return this;
  }
  
  public final tj QL(String paramString)
  {
    GMTrace.i(3625891921920L, 27015);
    this.eQB = paramString;
    this.uld = true;
    GMTrace.o(3625891921920L, 27015);
    return this;
  }
  
  public final tj QM(String paramString)
  {
    GMTrace.i(3626026139648L, 27016);
    this.appId = paramString;
    this.ulf = true;
    GMTrace.o(3626026139648L, 27016);
    return this;
  }
  
  public final tj QN(String paramString)
  {
    GMTrace.i(3626160357376L, 27017);
    this.gVf = paramString;
    this.ulg = true;
    GMTrace.o(3626160357376L, 27017);
    return this;
  }
  
  public final tj QO(String paramString)
  {
    GMTrace.i(3626294575104L, 27018);
    this.eAr = paramString;
    this.ulj = true;
    GMTrace.o(3626294575104L, 27018);
    return this;
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3626428792832L, 27019);
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
      if (this.ukZ != null) {
        paramVarArgs.e(4, this.ukZ);
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
      GMTrace.o(3626428792832L, 27019);
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
      if (this.ukZ != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.ukZ);
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
      GMTrace.o(3626428792832L, 27019);
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
        GMTrace.o(3626428792832L, 27019);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        tj localtj = (tj)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3626428792832L, 27019);
          return -1;
        case 1: 
          localtj.eDi = locala.yqV.nj();
          localtj.ukW = true;
          GMTrace.o(3626428792832L, 27019);
          return 0;
        case 2: 
          localtj.eMI = locala.yqV.readString();
          localtj.ukX = true;
          GMTrace.o(3626428792832L, 27019);
          return 0;
        case 3: 
          localtj.toUser = locala.yqV.readString();
          localtj.ukY = true;
          GMTrace.o(3626428792832L, 27019);
          return 0;
        case 4: 
          localtj.ukZ = locala.yqV.readString();
          localtj.ula = true;
          GMTrace.o(3626428792832L, 27019);
          return 0;
        case 5: 
          localtj.ulb = locala.yqV.readString();
          localtj.ulc = true;
          GMTrace.o(3626428792832L, 27019);
          return 0;
        case 6: 
          localtj.hcs = locala.yqV.nk();
          localtj.gHl = true;
          GMTrace.o(3626428792832L, 27019);
          return 0;
        case 7: 
          localtj.eQB = locala.yqV.readString();
          localtj.uld = true;
          GMTrace.o(3626428792832L, 27019);
          return 0;
        case 8: 
          localtj.eVH = locala.yqV.readString();
          localtj.ule = true;
          GMTrace.o(3626428792832L, 27019);
          return 0;
        case 9: 
          localtj.appId = locala.yqV.readString();
          localtj.ulf = true;
          GMTrace.o(3626428792832L, 27019);
          return 0;
        case 10: 
          localtj.gVf = locala.yqV.readString();
          localtj.ulg = true;
          GMTrace.o(3626428792832L, 27019);
          return 0;
        case 11: 
          localtj.ulh = locala.yqV.readString();
          localtj.uli = true;
          GMTrace.o(3626428792832L, 27019);
          return 0;
        }
        localtj.eAr = locala.yqV.readString();
        localtj.ulj = true;
        GMTrace.o(3626428792832L, 27019);
        return 0;
      }
      GMTrace.o(3626428792832L, 27019);
      return -1;
    }
  }
  
  public final tj eB(long paramLong)
  {
    GMTrace.i(3625757704192L, 27014);
    this.hcs = paramLong;
    this.gHl = true;
    GMTrace.o(3625757704192L, 27014);
    return this;
  }
  
  public final tj zU(int paramInt)
  {
    GMTrace.i(3625086615552L, 27009);
    this.eDi = paramInt;
    this.ukW = true;
    GMTrace.o(3625086615552L, 27009);
    return this;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\tj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */