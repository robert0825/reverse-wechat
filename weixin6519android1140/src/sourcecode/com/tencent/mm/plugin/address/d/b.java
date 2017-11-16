package com.tencent.mm.plugin.address.d;

import com.tencent.gmtrace.GMTrace;

public final class b
  extends com.tencent.mm.bm.a
{
  public String huC;
  public String huD;
  public String huE;
  public String huF;
  public String huG;
  public String huH;
  public String huI;
  public String huJ;
  public String huK;
  public int id;
  
  public b()
  {
    GMTrace.i(12818598330368L, 95506);
    GMTrace.o(12818598330368L, 95506);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12818732548096L, 95507);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.id);
      if (this.huC != null) {
        paramVarArgs.e(2, this.huC);
      }
      if (this.huD != null) {
        paramVarArgs.e(3, this.huD);
      }
      if (this.huE != null) {
        paramVarArgs.e(4, this.huE);
      }
      if (this.huF != null) {
        paramVarArgs.e(5, this.huF);
      }
      if (this.huG != null) {
        paramVarArgs.e(6, this.huG);
      }
      if (this.huH != null) {
        paramVarArgs.e(7, this.huH);
      }
      if (this.huI != null) {
        paramVarArgs.e(8, this.huI);
      }
      if (this.huJ != null) {
        paramVarArgs.e(9, this.huJ);
      }
      if (this.huK != null) {
        paramVarArgs.e(10, this.huK);
      }
      GMTrace.o(12818732548096L, 95507);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.id) + 0;
      paramInt = i;
      if (this.huC != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.huC);
      }
      i = paramInt;
      if (this.huD != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.huD);
      }
      paramInt = i;
      if (this.huE != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.huE);
      }
      i = paramInt;
      if (this.huF != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.huF);
      }
      paramInt = i;
      if (this.huG != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.huG);
      }
      i = paramInt;
      if (this.huH != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.huH);
      }
      paramInt = i;
      if (this.huI != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.huI);
      }
      i = paramInt;
      if (this.huJ != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.huJ);
      }
      paramInt = i;
      if (this.huK != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.huK);
      }
      GMTrace.o(12818732548096L, 95507);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(12818732548096L, 95507);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      b localb = (b)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(12818732548096L, 95507);
        return -1;
      case 1: 
        localb.id = locala.yqV.nj();
        GMTrace.o(12818732548096L, 95507);
        return 0;
      case 2: 
        localb.huC = locala.yqV.readString();
        GMTrace.o(12818732548096L, 95507);
        return 0;
      case 3: 
        localb.huD = locala.yqV.readString();
        GMTrace.o(12818732548096L, 95507);
        return 0;
      case 4: 
        localb.huE = locala.yqV.readString();
        GMTrace.o(12818732548096L, 95507);
        return 0;
      case 5: 
        localb.huF = locala.yqV.readString();
        GMTrace.o(12818732548096L, 95507);
        return 0;
      case 6: 
        localb.huG = locala.yqV.readString();
        GMTrace.o(12818732548096L, 95507);
        return 0;
      case 7: 
        localb.huH = locala.yqV.readString();
        GMTrace.o(12818732548096L, 95507);
        return 0;
      case 8: 
        localb.huI = locala.yqV.readString();
        GMTrace.o(12818732548096L, 95507);
        return 0;
      case 9: 
        localb.huJ = locala.yqV.readString();
        GMTrace.o(12818732548096L, 95507);
        return 0;
      }
      localb.huK = locala.yqV.readString();
      GMTrace.o(12818732548096L, 95507);
      return 0;
    }
    GMTrace.o(12818732548096L, 95507);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\address\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */