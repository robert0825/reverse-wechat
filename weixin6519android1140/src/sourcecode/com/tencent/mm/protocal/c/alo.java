package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class alo
  extends com.tencent.mm.bm.a
{
  public String jhi;
  public String jio;
  public String ubV;
  public String ubW;
  public String uoe;
  
  public alo()
  {
    GMTrace.i(4016197074944L, 29923);
    GMTrace.o(4016197074944L, 29923);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4016331292672L, 29924);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jhi != null) {
        paramVarArgs.e(1, this.jhi);
      }
      if (this.jio != null) {
        paramVarArgs.e(2, this.jio);
      }
      if (this.ubV != null) {
        paramVarArgs.e(3, this.ubV);
      }
      if (this.ubW != null) {
        paramVarArgs.e(4, this.ubW);
      }
      if (this.uoe != null) {
        paramVarArgs.e(5, this.uoe);
      }
      GMTrace.o(4016331292672L, 29924);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jhi == null) {
        break label498;
      }
    }
    label498:
    for (int i = b.a.a.b.b.a.f(1, this.jhi) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jio != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.jio);
      }
      i = paramInt;
      if (this.ubV != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.ubV);
      }
      paramInt = i;
      if (this.ubW != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.ubW);
      }
      i = paramInt;
      if (this.uoe != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.uoe);
      }
      GMTrace.o(4016331292672L, 29924);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(4016331292672L, 29924);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        alo localalo = (alo)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(4016331292672L, 29924);
          return -1;
        case 1: 
          localalo.jhi = locala.yqV.readString();
          GMTrace.o(4016331292672L, 29924);
          return 0;
        case 2: 
          localalo.jio = locala.yqV.readString();
          GMTrace.o(4016331292672L, 29924);
          return 0;
        case 3: 
          localalo.ubV = locala.yqV.readString();
          GMTrace.o(4016331292672L, 29924);
          return 0;
        case 4: 
          localalo.ubW = locala.yqV.readString();
          GMTrace.o(4016331292672L, 29924);
          return 0;
        }
        localalo.uoe = locala.yqV.readString();
        GMTrace.o(4016331292672L, 29924);
        return 0;
      }
      GMTrace.o(4016331292672L, 29924);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\alo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */