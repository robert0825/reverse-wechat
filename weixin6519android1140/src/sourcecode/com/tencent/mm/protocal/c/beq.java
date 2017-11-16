package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class beq
  extends com.tencent.mm.bm.a
{
  public int jib;
  public int nFd;
  public String nIp;
  public int tQP;
  public String uKB;
  public String uQj;
  public String uQk;
  public int uQl;
  public int uQm;
  public int uQn;
  public long uQo;
  public long uQp;
  public azp uQq;
  public int uQr;
  public String uhT;
  
  public beq()
  {
    GMTrace.i(3673539215360L, 27370);
    GMTrace.o(3673539215360L, 27370);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3673673433088L, 27371);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uKB != null) {
        paramVarArgs.e(1, this.uKB);
      }
      if (this.uhT != null) {
        paramVarArgs.e(2, this.uhT);
      }
      if (this.uQj != null) {
        paramVarArgs.e(3, this.uQj);
      }
      if (this.uQk != null) {
        paramVarArgs.e(4, this.uQk);
      }
      paramVarArgs.fk(5, this.jib);
      paramVarArgs.fk(6, this.tQP);
      paramVarArgs.fk(7, this.nFd);
      if (this.nIp != null) {
        paramVarArgs.e(8, this.nIp);
      }
      paramVarArgs.fk(9, this.uQl);
      paramVarArgs.fk(10, this.uQm);
      paramVarArgs.fk(11, this.uQn);
      paramVarArgs.T(12, this.uQo);
      paramVarArgs.T(13, this.uQp);
      if (this.uQq != null)
      {
        paramVarArgs.fm(14, this.uQq.aYq());
        this.uQq.a(paramVarArgs);
      }
      paramVarArgs.fk(15, this.uQr);
      GMTrace.o(3673673433088L, 27371);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uKB != null) {
        i = b.a.a.b.b.a.f(1, this.uKB) + 0;
      }
      paramInt = i;
      if (this.uhT != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uhT);
      }
      i = paramInt;
      if (this.uQj != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uQj);
      }
      paramInt = i;
      if (this.uQk != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uQk);
      }
      i = paramInt + b.a.a.a.fh(5, this.jib) + b.a.a.a.fh(6, this.tQP) + b.a.a.a.fh(7, this.nFd);
      paramInt = i;
      if (this.nIp != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.nIp);
      }
      i = paramInt + b.a.a.a.fh(9, this.uQl) + b.a.a.a.fh(10, this.uQm) + b.a.a.a.fh(11, this.uQn) + b.a.a.a.S(12, this.uQo) + b.a.a.a.S(13, this.uQp);
      paramInt = i;
      if (this.uQq != null) {
        paramInt = i + b.a.a.a.fj(14, this.uQq.aYq());
      }
      i = b.a.a.a.fh(15, this.uQr);
      GMTrace.o(3673673433088L, 27371);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3673673433088L, 27371);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      beq localbeq = (beq)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3673673433088L, 27371);
        return -1;
      case 1: 
        localbeq.uKB = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3673673433088L, 27371);
        return 0;
      case 2: 
        localbeq.uhT = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3673673433088L, 27371);
        return 0;
      case 3: 
        localbeq.uQj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3673673433088L, 27371);
        return 0;
      case 4: 
        localbeq.uQk = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3673673433088L, 27371);
        return 0;
      case 5: 
        localbeq.jib = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3673673433088L, 27371);
        return 0;
      case 6: 
        localbeq.tQP = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3673673433088L, 27371);
        return 0;
      case 7: 
        localbeq.nFd = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3673673433088L, 27371);
        return 0;
      case 8: 
        localbeq.nIp = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3673673433088L, 27371);
        return 0;
      case 9: 
        localbeq.uQl = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3673673433088L, 27371);
        return 0;
      case 10: 
        localbeq.uQm = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3673673433088L, 27371);
        return 0;
      case 11: 
        localbeq.uQn = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3673673433088L, 27371);
        return 0;
      case 12: 
        localbeq.uQo = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3673673433088L, 27371);
        return 0;
      case 13: 
        localbeq.uQp = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3673673433088L, 27371);
        return 0;
      case 14: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbeq.uQq = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3673673433088L, 27371);
        return 0;
      }
      localbeq.uQr = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3673673433088L, 27371);
      return 0;
    }
    GMTrace.o(3673673433088L, 27371);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\beq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */