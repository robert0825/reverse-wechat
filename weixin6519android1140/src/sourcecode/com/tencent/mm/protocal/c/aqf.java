package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aqf
  extends com.tencent.mm.bm.a
{
  public String jhi;
  public String jio;
  public int kAW;
  public String tUp;
  public String uGe;
  public String ueH;
  public int umS;
  public int uxU;
  
  public aqf()
  {
    GMTrace.i(3968818216960L, 29570);
    GMTrace.o(3968818216960L, 29570);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3968952434688L, 29571);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.kAW);
      if (this.jio != null) {
        paramVarArgs.e(2, this.jio);
      }
      if (this.tUp != null) {
        paramVarArgs.e(3, this.tUp);
      }
      if (this.ueH != null) {
        paramVarArgs.e(4, this.ueH);
      }
      if (this.jhi != null) {
        paramVarArgs.e(5, this.jhi);
      }
      paramVarArgs.fk(6, this.uxU);
      paramVarArgs.fk(7, this.umS);
      if (this.uGe != null) {
        paramVarArgs.e(8, this.uGe);
      }
      GMTrace.o(3968952434688L, 29571);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.kAW) + 0;
      paramInt = i;
      if (this.jio != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.jio);
      }
      i = paramInt;
      if (this.tUp != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tUp);
      }
      paramInt = i;
      if (this.ueH != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.ueH);
      }
      i = paramInt;
      if (this.jhi != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.jhi);
      }
      i = i + b.a.a.a.fh(6, this.uxU) + b.a.a.a.fh(7, this.umS);
      paramInt = i;
      if (this.uGe != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.uGe);
      }
      GMTrace.o(3968952434688L, 29571);
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
      GMTrace.o(3968952434688L, 29571);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      aqf localaqf = (aqf)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3968952434688L, 29571);
        return -1;
      case 1: 
        localaqf.kAW = locala.yqV.nj();
        GMTrace.o(3968952434688L, 29571);
        return 0;
      case 2: 
        localaqf.jio = locala.yqV.readString();
        GMTrace.o(3968952434688L, 29571);
        return 0;
      case 3: 
        localaqf.tUp = locala.yqV.readString();
        GMTrace.o(3968952434688L, 29571);
        return 0;
      case 4: 
        localaqf.ueH = locala.yqV.readString();
        GMTrace.o(3968952434688L, 29571);
        return 0;
      case 5: 
        localaqf.jhi = locala.yqV.readString();
        GMTrace.o(3968952434688L, 29571);
        return 0;
      case 6: 
        localaqf.uxU = locala.yqV.nj();
        GMTrace.o(3968952434688L, 29571);
        return 0;
      case 7: 
        localaqf.umS = locala.yqV.nj();
        GMTrace.o(3968952434688L, 29571);
        return 0;
      }
      localaqf.uGe = locala.yqV.readString();
      GMTrace.o(3968952434688L, 29571);
      return 0;
    }
    GMTrace.o(3968952434688L, 29571);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\aqf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */