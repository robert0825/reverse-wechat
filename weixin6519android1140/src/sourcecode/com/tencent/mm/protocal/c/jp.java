package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class jp
  extends com.tencent.mm.bm.a
{
  public String country;
  public String descriptor;
  public float eMl;
  public float eNR;
  public String fjk;
  public String fjl;
  public String gEy;
  public String jxX;
  public String jzu;
  public String name;
  public float tZw;
  public String tZx;
  public String tZy;
  
  public jp()
  {
    GMTrace.i(3844129947648L, 28641);
    GMTrace.o(3844129947648L, 28641);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3844264165376L, 28642);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.name != null) {
        paramVarArgs.e(1, this.name);
      }
      if (this.descriptor != null) {
        paramVarArgs.e(2, this.descriptor);
      }
      if (this.jxX != null) {
        paramVarArgs.e(3, this.jxX);
      }
      if (this.country != null) {
        paramVarArgs.e(4, this.country);
      }
      if (this.fjk != null) {
        paramVarArgs.e(5, this.fjk);
      }
      if (this.fjl != null) {
        paramVarArgs.e(6, this.fjl);
      }
      if (this.gEy != null) {
        paramVarArgs.e(7, this.gEy);
      }
      paramVarArgs.n(8, this.tZw);
      paramVarArgs.n(9, this.eNR);
      paramVarArgs.n(10, this.eMl);
      if (this.jzu != null) {
        paramVarArgs.e(11, this.jzu);
      }
      if (this.tZx != null) {
        paramVarArgs.e(12, this.tZx);
      }
      if (this.tZy != null) {
        paramVarArgs.e(13, this.tZy);
      }
      GMTrace.o(3844264165376L, 28642);
      return 0;
    }
    if (paramInt == 1) {
      if (this.name == null) {
        break label970;
      }
    }
    label970:
    for (int i = b.a.a.b.b.a.f(1, this.name) + 0;; i = 0)
    {
      paramInt = i;
      if (this.descriptor != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.descriptor);
      }
      i = paramInt;
      if (this.jxX != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.jxX);
      }
      paramInt = i;
      if (this.country != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.country);
      }
      i = paramInt;
      if (this.fjk != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.fjk);
      }
      paramInt = i;
      if (this.fjl != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.fjl);
      }
      i = paramInt;
      if (this.gEy != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.gEy);
      }
      i = i + (b.a.a.b.b.a.cK(8) + 4) + (b.a.a.b.b.a.cK(9) + 4) + (b.a.a.b.b.a.cK(10) + 4);
      paramInt = i;
      if (this.jzu != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.jzu);
      }
      i = paramInt;
      if (this.tZx != null) {
        i = paramInt + b.a.a.b.b.a.f(12, this.tZx);
      }
      paramInt = i;
      if (this.tZy != null) {
        paramInt = i + b.a.a.b.b.a.f(13, this.tZy);
      }
      GMTrace.o(3844264165376L, 28642);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3844264165376L, 28642);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        jp localjp = (jp)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3844264165376L, 28642);
          return -1;
        case 1: 
          localjp.name = locala.yqV.readString();
          GMTrace.o(3844264165376L, 28642);
          return 0;
        case 2: 
          localjp.descriptor = locala.yqV.readString();
          GMTrace.o(3844264165376L, 28642);
          return 0;
        case 3: 
          localjp.jxX = locala.yqV.readString();
          GMTrace.o(3844264165376L, 28642);
          return 0;
        case 4: 
          localjp.country = locala.yqV.readString();
          GMTrace.o(3844264165376L, 28642);
          return 0;
        case 5: 
          localjp.fjk = locala.yqV.readString();
          GMTrace.o(3844264165376L, 28642);
          return 0;
        case 6: 
          localjp.fjl = locala.yqV.readString();
          GMTrace.o(3844264165376L, 28642);
          return 0;
        case 7: 
          localjp.gEy = locala.yqV.readString();
          GMTrace.o(3844264165376L, 28642);
          return 0;
        case 8: 
          localjp.tZw = locala.yqV.readFloat();
          GMTrace.o(3844264165376L, 28642);
          return 0;
        case 9: 
          localjp.eNR = locala.yqV.readFloat();
          GMTrace.o(3844264165376L, 28642);
          return 0;
        case 10: 
          localjp.eMl = locala.yqV.readFloat();
          GMTrace.o(3844264165376L, 28642);
          return 0;
        case 11: 
          localjp.jzu = locala.yqV.readString();
          GMTrace.o(3844264165376L, 28642);
          return 0;
        case 12: 
          localjp.tZx = locala.yqV.readString();
          GMTrace.o(3844264165376L, 28642);
          return 0;
        }
        localjp.tZy = locala.yqV.readString();
        GMTrace.o(3844264165376L, 28642);
        return 0;
      }
      GMTrace.o(3844264165376L, 28642);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\jp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */