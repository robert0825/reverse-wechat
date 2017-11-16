package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aac
  extends azh
{
  public azp tQz;
  public int uqH;
  public LinkedList<rh> uqI;
  public qw uqJ;
  public int uqK;
  public LinkedList<qw> uqL;
  public int uqM;
  public LinkedList<ra> uqN;
  public int uqO;
  public LinkedList<qy> uqP;
  public int uqQ;
  public int uqR;
  public int uqS;
  public LinkedList<qy> uqT;
  
  public aac()
  {
    GMTrace.i(3919962963968L, 29206);
    this.uqI = new LinkedList();
    this.uqL = new LinkedList();
    this.uqN = new LinkedList();
    this.uqP = new LinkedList();
    this.uqT = new LinkedList();
    GMTrace.o(3919962963968L, 29206);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3920097181696L, 29207);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.tQz == null) {
        throw new b("Not all required fields were included: ReqBuf");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.tQz != null)
      {
        paramVarArgs.fm(2, this.tQz.aYq());
        this.tQz.a(paramVarArgs);
      }
      paramVarArgs.fk(3, this.uqH);
      paramVarArgs.d(4, 8, this.uqI);
      if (this.uqJ != null)
      {
        paramVarArgs.fm(5, this.uqJ.aYq());
        this.uqJ.a(paramVarArgs);
      }
      paramVarArgs.fk(6, this.uqK);
      paramVarArgs.d(7, 8, this.uqL);
      paramVarArgs.fk(8, this.uqM);
      paramVarArgs.d(9, 8, this.uqN);
      paramVarArgs.fk(10, this.uqO);
      paramVarArgs.d(11, 8, this.uqP);
      paramVarArgs.fk(12, this.uqQ);
      paramVarArgs.fk(13, this.uqR);
      paramVarArgs.fk(14, this.uqS);
      paramVarArgs.d(15, 8, this.uqT);
      GMTrace.o(3920097181696L, 29207);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt;
      if (this.tQz != null) {
        i = paramInt + b.a.a.a.fj(2, this.tQz.aYq());
      }
      i = i + b.a.a.a.fh(3, this.uqH) + b.a.a.a.c(4, 8, this.uqI);
      paramInt = i;
      if (this.uqJ != null) {
        paramInt = i + b.a.a.a.fj(5, this.uqJ.aYq());
      }
      i = b.a.a.a.fh(6, this.uqK);
      int j = b.a.a.a.c(7, 8, this.uqL);
      int k = b.a.a.a.fh(8, this.uqM);
      int m = b.a.a.a.c(9, 8, this.uqN);
      int n = b.a.a.a.fh(10, this.uqO);
      int i1 = b.a.a.a.c(11, 8, this.uqP);
      int i2 = b.a.a.a.fh(12, this.uqQ);
      int i3 = b.a.a.a.fh(13, this.uqR);
      int i4 = b.a.a.a.fh(14, this.uqS);
      int i5 = b.a.a.a.c(15, 8, this.uqT);
      GMTrace.o(3920097181696L, 29207);
      return paramInt + i + j + k + m + n + i1 + i2 + i3 + i4 + i5;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uqI.clear();
      this.uqL.clear();
      this.uqN.clear();
      this.uqP.clear();
      this.uqT.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.tQz == null) {
        throw new b("Not all required fields were included: ReqBuf");
      }
      GMTrace.o(3920097181696L, 29207);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aac localaac = (aac)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3920097181696L, 29207);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaac.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3920097181696L, 29207);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaac.tQz = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3920097181696L, 29207);
        return 0;
      case 3: 
        localaac.uqH = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3920097181696L, 29207);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new rh();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((rh)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaac.uqI.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3920097181696L, 29207);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new qw();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((qw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaac.uqJ = ((qw)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3920097181696L, 29207);
        return 0;
      case 6: 
        localaac.uqK = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3920097181696L, 29207);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new qw();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((qw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaac.uqL.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3920097181696L, 29207);
        return 0;
      case 8: 
        localaac.uqM = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3920097181696L, 29207);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ra();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ra)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaac.uqN.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3920097181696L, 29207);
        return 0;
      case 10: 
        localaac.uqO = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3920097181696L, 29207);
        return 0;
      case 11: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new qy();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((qy)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaac.uqP.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3920097181696L, 29207);
        return 0;
      case 12: 
        localaac.uqQ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3920097181696L, 29207);
        return 0;
      case 13: 
        localaac.uqR = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3920097181696L, 29207);
        return 0;
      case 14: 
        localaac.uqS = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3920097181696L, 29207);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new qy();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((qy)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localaac.uqT.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3920097181696L, 29207);
      return 0;
    }
    GMTrace.o(3920097181696L, 29207);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */