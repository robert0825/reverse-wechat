package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class to
  extends com.tencent.mm.bm.a
{
  public int eMn;
  public String eQm;
  public String label;
  public double lat;
  public double lng;
  public boolean ulo;
  public boolean ulp;
  public boolean ulq;
  public boolean ulr;
  public boolean uls;
  
  public to()
  {
    GMTrace.i(3983313731584L, 29678);
    this.ulo = false;
    this.ulp = false;
    this.ulq = false;
    this.ulr = false;
    this.uls = false;
    GMTrace.o(3983313731584L, 29678);
  }
  
  public final to QP(String paramString)
  {
    GMTrace.i(3983850602496L, 29682);
    this.label = paramString;
    this.ulr = true;
    GMTrace.o(3983850602496L, 29682);
    return this;
  }
  
  public final to QQ(String paramString)
  {
    GMTrace.i(3983984820224L, 29683);
    this.eQm = paramString;
    this.uls = true;
    GMTrace.o(3983984820224L, 29683);
    return this;
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3984119037952L, 29684);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ulo == true) {
        paramVarArgs.a(1, this.lng);
      }
      if (this.ulp == true) {
        paramVarArgs.a(2, this.lat);
      }
      if (this.ulq == true) {
        paramVarArgs.fk(3, this.eMn);
      }
      if (this.label != null) {
        paramVarArgs.e(4, this.label);
      }
      if (this.eQm != null) {
        paramVarArgs.e(5, this.eQm);
      }
      GMTrace.o(3984119037952L, 29684);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ulo != true) {
        break label532;
      }
    }
    label532:
    for (int i = b.a.a.b.b.a.cK(1) + 8 + 0;; i = 0)
    {
      paramInt = i;
      if (this.ulp == true) {
        paramInt = i + (b.a.a.b.b.a.cK(2) + 8);
      }
      i = paramInt;
      if (this.ulq == true) {
        i = paramInt + b.a.a.a.fh(3, this.eMn);
      }
      paramInt = i;
      if (this.label != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.label);
      }
      i = paramInt;
      if (this.eQm != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.eQm);
      }
      GMTrace.o(3984119037952L, 29684);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3984119037952L, 29684);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        to localto = (to)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3984119037952L, 29684);
          return -1;
        case 1: 
          localto.lng = locala.yqV.readDouble();
          localto.ulo = true;
          GMTrace.o(3984119037952L, 29684);
          return 0;
        case 2: 
          localto.lat = locala.yqV.readDouble();
          localto.ulp = true;
          GMTrace.o(3984119037952L, 29684);
          return 0;
        case 3: 
          localto.eMn = locala.yqV.nj();
          localto.ulq = true;
          GMTrace.o(3984119037952L, 29684);
          return 0;
        case 4: 
          localto.label = locala.yqV.readString();
          localto.ulr = true;
          GMTrace.o(3984119037952L, 29684);
          return 0;
        }
        localto.eQm = locala.yqV.readString();
        localto.uls = true;
        GMTrace.o(3984119037952L, 29684);
        return 0;
      }
      GMTrace.o(3984119037952L, 29684);
      return -1;
    }
  }
  
  public final to p(double paramDouble)
  {
    GMTrace.i(3983447949312L, 29679);
    this.lng = paramDouble;
    this.ulo = true;
    GMTrace.o(3983447949312L, 29679);
    return this;
  }
  
  public final to q(double paramDouble)
  {
    GMTrace.i(3983582167040L, 29680);
    this.lat = paramDouble;
    this.ulp = true;
    GMTrace.o(3983582167040L, 29680);
    return this;
  }
  
  public final to zV(int paramInt)
  {
    GMTrace.i(3983716384768L, 29681);
    this.eMn = paramInt;
    this.ulq = true;
    GMTrace.o(3983716384768L, 29681);
    return this;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\to.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */