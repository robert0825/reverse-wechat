package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class cv
  extends com.tencent.mm.bm.a
{
  public int jib;
  public String lQa;
  public String lSX;
  public String lSY;
  public int nFd;
  public String nIp;
  public int tQM;
  public String tQN;
  public azp tQO;
  public int tQP;
  public int tQQ;
  public String tQR;
  public String tQS;
  public String tQT;
  public String tQb;
  
  public cv()
  {
    GMTrace.i(4009754624000L, 29875);
    GMTrace.o(4009754624000L, 29875);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4009888841728L, 29876);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lSY != null) {
        paramVarArgs.e(1, this.lSY);
      }
      if (this.lQa != null) {
        paramVarArgs.e(2, this.lQa);
      }
      paramVarArgs.fk(3, this.tQM);
      if (this.lSX != null) {
        paramVarArgs.e(4, this.lSX);
      }
      paramVarArgs.fk(5, this.jib);
      if (this.nIp != null) {
        paramVarArgs.e(6, this.nIp);
      }
      paramVarArgs.fk(7, this.nFd);
      if (this.tQN != null) {
        paramVarArgs.e(8, this.tQN);
      }
      if (this.tQO != null)
      {
        paramVarArgs.fm(9, this.tQO.aYq());
        this.tQO.a(paramVarArgs);
      }
      paramVarArgs.fk(10, this.tQP);
      paramVarArgs.fk(11, this.tQQ);
      if (this.tQb != null) {
        paramVarArgs.e(12, this.tQb);
      }
      if (this.tQR != null) {
        paramVarArgs.e(13, this.tQR);
      }
      if (this.tQS != null) {
        paramVarArgs.e(14, this.tQS);
      }
      if (this.tQT != null) {
        paramVarArgs.e(15, this.tQT);
      }
      GMTrace.o(4009888841728L, 29876);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.lSY != null) {
        paramInt = b.a.a.b.b.a.f(1, this.lSY) + 0;
      }
      i = paramInt;
      if (this.lQa != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.lQa);
      }
      i += b.a.a.a.fh(3, this.tQM);
      paramInt = i;
      if (this.lSX != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lSX);
      }
      i = paramInt + b.a.a.a.fh(5, this.jib);
      paramInt = i;
      if (this.nIp != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.nIp);
      }
      i = paramInt + b.a.a.a.fh(7, this.nFd);
      paramInt = i;
      if (this.tQN != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.tQN);
      }
      i = paramInt;
      if (this.tQO != null) {
        i = paramInt + b.a.a.a.fj(9, this.tQO.aYq());
      }
      i = i + b.a.a.a.fh(10, this.tQP) + b.a.a.a.fh(11, this.tQQ);
      paramInt = i;
      if (this.tQb != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.tQb);
      }
      i = paramInt;
      if (this.tQR != null) {
        i = paramInt + b.a.a.b.b.a.f(13, this.tQR);
      }
      paramInt = i;
      if (this.tQS != null) {
        paramInt = i + b.a.a.b.b.a.f(14, this.tQS);
      }
      i = paramInt;
      if (this.tQT != null) {
        i = paramInt + b.a.a.b.b.a.f(15, this.tQT);
      }
      GMTrace.o(4009888841728L, 29876);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(4009888841728L, 29876);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      cv localcv = (cv)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(4009888841728L, 29876);
        return -1;
      case 1: 
        localcv.lSY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4009888841728L, 29876);
        return 0;
      case 2: 
        localcv.lQa = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4009888841728L, 29876);
        return 0;
      case 3: 
        localcv.tQM = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4009888841728L, 29876);
        return 0;
      case 4: 
        localcv.lSX = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4009888841728L, 29876);
        return 0;
      case 5: 
        localcv.jib = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4009888841728L, 29876);
        return 0;
      case 6: 
        localcv.nIp = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4009888841728L, 29876);
        return 0;
      case 7: 
        localcv.nFd = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4009888841728L, 29876);
        return 0;
      case 8: 
        localcv.tQN = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4009888841728L, 29876);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localcv.tQO = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4009888841728L, 29876);
        return 0;
      case 10: 
        localcv.tQP = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4009888841728L, 29876);
        return 0;
      case 11: 
        localcv.tQQ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4009888841728L, 29876);
        return 0;
      case 12: 
        localcv.tQb = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4009888841728L, 29876);
        return 0;
      case 13: 
        localcv.tQR = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4009888841728L, 29876);
        return 0;
      case 14: 
        localcv.tQS = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4009888841728L, 29876);
        return 0;
      }
      localcv.tQT = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(4009888841728L, 29876);
      return 0;
    }
    GMTrace.o(4009888841728L, 29876);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\cv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */