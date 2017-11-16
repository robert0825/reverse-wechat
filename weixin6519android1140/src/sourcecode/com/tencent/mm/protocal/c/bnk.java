package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bnk
  extends com.tencent.mm.bm.a
{
  public String oqQ;
  public String uNG;
  public String uXo;
  public int uXp;
  public String uXq;
  public String uXr;
  public int uXs;
  public String uXt;
  public String uoe;
  
  public bnk()
  {
    GMTrace.i(3881979346944L, 28923);
    GMTrace.o(3881979346944L, 28923);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3882113564672L, 28924);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.oqQ != null) {
        paramVarArgs.e(1, this.oqQ);
      }
      if (this.uXo != null) {
        paramVarArgs.e(2, this.uXo);
      }
      if (this.uoe != null) {
        paramVarArgs.e(3, this.uoe);
      }
      paramVarArgs.fk(4, this.uXp);
      if (this.uNG != null) {
        paramVarArgs.e(5, this.uNG);
      }
      if (this.uXq != null) {
        paramVarArgs.e(6, this.uXq);
      }
      if (this.uXr != null) {
        paramVarArgs.e(7, this.uXr);
      }
      paramVarArgs.fk(8, this.uXs);
      if (this.uXt != null) {
        paramVarArgs.e(9, this.uXt);
      }
      GMTrace.o(3882113564672L, 28924);
      return 0;
    }
    if (paramInt == 1) {
      if (this.oqQ == null) {
        break label730;
      }
    }
    label730:
    for (int i = b.a.a.b.b.a.f(1, this.oqQ) + 0;; i = 0)
    {
      paramInt = i;
      if (this.uXo != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uXo);
      }
      i = paramInt;
      if (this.uoe != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uoe);
      }
      i += b.a.a.a.fh(4, this.uXp);
      paramInt = i;
      if (this.uNG != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.uNG);
      }
      i = paramInt;
      if (this.uXq != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.uXq);
      }
      paramInt = i;
      if (this.uXr != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.uXr);
      }
      i = paramInt + b.a.a.a.fh(8, this.uXs);
      paramInt = i;
      if (this.uXt != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.uXt);
      }
      GMTrace.o(3882113564672L, 28924);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3882113564672L, 28924);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bnk localbnk = (bnk)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3882113564672L, 28924);
          return -1;
        case 1: 
          localbnk.oqQ = locala.yqV.readString();
          GMTrace.o(3882113564672L, 28924);
          return 0;
        case 2: 
          localbnk.uXo = locala.yqV.readString();
          GMTrace.o(3882113564672L, 28924);
          return 0;
        case 3: 
          localbnk.uoe = locala.yqV.readString();
          GMTrace.o(3882113564672L, 28924);
          return 0;
        case 4: 
          localbnk.uXp = locala.yqV.nj();
          GMTrace.o(3882113564672L, 28924);
          return 0;
        case 5: 
          localbnk.uNG = locala.yqV.readString();
          GMTrace.o(3882113564672L, 28924);
          return 0;
        case 6: 
          localbnk.uXq = locala.yqV.readString();
          GMTrace.o(3882113564672L, 28924);
          return 0;
        case 7: 
          localbnk.uXr = locala.yqV.readString();
          GMTrace.o(3882113564672L, 28924);
          return 0;
        case 8: 
          localbnk.uXs = locala.yqV.nj();
          GMTrace.o(3882113564672L, 28924);
          return 0;
        }
        localbnk.uXt = locala.yqV.readString();
        GMTrace.o(3882113564672L, 28924);
        return 0;
      }
      GMTrace.o(3882113564672L, 28924);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bnk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */