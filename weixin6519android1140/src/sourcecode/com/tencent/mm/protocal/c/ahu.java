package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ahu
  extends com.tencent.mm.bm.a
{
  public String eBt;
  public int jib;
  public String lPM;
  public String lRT;
  public String udc;
  public String uxo;
  public String uxp;
  public String uxq;
  public String uxr;
  public int uxs;
  public String uxt;
  
  public ahu()
  {
    GMTrace.i(3634884509696L, 27082);
    GMTrace.o(3634884509696L, 27082);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3635018727424L, 27083);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.eBt != null) {
        paramVarArgs.e(1, this.eBt);
      }
      if (this.uxo != null) {
        paramVarArgs.e(2, this.uxo);
      }
      paramVarArgs.fk(3, this.jib);
      if (this.lPM != null) {
        paramVarArgs.e(4, this.lPM);
      }
      if (this.uxp != null) {
        paramVarArgs.e(5, this.uxp);
      }
      if (this.udc != null) {
        paramVarArgs.e(6, this.udc);
      }
      if (this.uxq != null) {
        paramVarArgs.e(7, this.uxq);
      }
      if (this.lRT != null) {
        paramVarArgs.e(8, this.lRT);
      }
      if (this.uxr != null) {
        paramVarArgs.e(9, this.uxr);
      }
      paramVarArgs.fk(10, this.uxs);
      if (this.uxt != null) {
        paramVarArgs.e(11, this.uxt);
      }
      GMTrace.o(3635018727424L, 27083);
      return 0;
    }
    if (paramInt == 1) {
      if (this.eBt == null) {
        break label862;
      }
    }
    label862:
    for (paramInt = b.a.a.b.b.a.f(1, this.eBt) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.uxo != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.uxo);
      }
      i += b.a.a.a.fh(3, this.jib);
      paramInt = i;
      if (this.lPM != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lPM);
      }
      i = paramInt;
      if (this.uxp != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.uxp);
      }
      paramInt = i;
      if (this.udc != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.udc);
      }
      i = paramInt;
      if (this.uxq != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.uxq);
      }
      paramInt = i;
      if (this.lRT != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.lRT);
      }
      i = paramInt;
      if (this.uxr != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.uxr);
      }
      i += b.a.a.a.fh(10, this.uxs);
      paramInt = i;
      if (this.uxt != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.uxt);
      }
      GMTrace.o(3635018727424L, 27083);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3635018727424L, 27083);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ahu localahu = (ahu)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3635018727424L, 27083);
          return -1;
        case 1: 
          localahu.eBt = locala.yqV.readString();
          GMTrace.o(3635018727424L, 27083);
          return 0;
        case 2: 
          localahu.uxo = locala.yqV.readString();
          GMTrace.o(3635018727424L, 27083);
          return 0;
        case 3: 
          localahu.jib = locala.yqV.nj();
          GMTrace.o(3635018727424L, 27083);
          return 0;
        case 4: 
          localahu.lPM = locala.yqV.readString();
          GMTrace.o(3635018727424L, 27083);
          return 0;
        case 5: 
          localahu.uxp = locala.yqV.readString();
          GMTrace.o(3635018727424L, 27083);
          return 0;
        case 6: 
          localahu.udc = locala.yqV.readString();
          GMTrace.o(3635018727424L, 27083);
          return 0;
        case 7: 
          localahu.uxq = locala.yqV.readString();
          GMTrace.o(3635018727424L, 27083);
          return 0;
        case 8: 
          localahu.lRT = locala.yqV.readString();
          GMTrace.o(3635018727424L, 27083);
          return 0;
        case 9: 
          localahu.uxr = locala.yqV.readString();
          GMTrace.o(3635018727424L, 27083);
          return 0;
        case 10: 
          localahu.uxs = locala.yqV.nj();
          GMTrace.o(3635018727424L, 27083);
          return 0;
        }
        localahu.uxt = locala.yqV.readString();
        GMTrace.o(3635018727424L, 27083);
        return 0;
      }
      GMTrace.o(3635018727424L, 27083);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ahu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */