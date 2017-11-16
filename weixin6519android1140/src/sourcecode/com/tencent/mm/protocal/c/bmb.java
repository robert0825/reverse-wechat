package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bmb
  extends azh
{
  public int nFd;
  public int tPV;
  public azq tPW;
  public azq tPX;
  public long tQd;
  public int tRC;
  public int tRD;
  public int tRE;
  public String tYF;
  public String tYJ;
  public azq uVR;
  
  public bmb()
  {
    GMTrace.i(3899293433856L, 29052);
    GMTrace.o(3899293433856L, 29052);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3899427651584L, 29053);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uVR == null) {
        throw new b("Not all required fields were included: ClientImgId");
      }
      if (this.tPW == null) {
        throw new b("Not all required fields were included: FromUserName");
      }
      if (this.tPX == null) {
        throw new b("Not all required fields were included: ToUserName");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tPV);
      if (this.uVR != null)
      {
        paramVarArgs.fm(3, this.uVR.aYq());
        this.uVR.a(paramVarArgs);
      }
      if (this.tPW != null)
      {
        paramVarArgs.fm(4, this.tPW.aYq());
        this.tPW.a(paramVarArgs);
      }
      if (this.tPX != null)
      {
        paramVarArgs.fm(5, this.tPX.aYq());
        this.tPX.a(paramVarArgs);
      }
      paramVarArgs.fk(6, this.tRC);
      paramVarArgs.fk(7, this.tRD);
      paramVarArgs.fk(8, this.tRE);
      paramVarArgs.fk(9, this.nFd);
      paramVarArgs.T(10, this.tQd);
      if (this.tYF != null) {
        paramVarArgs.e(11, this.tYF);
      }
      if (this.tYJ != null) {
        paramVarArgs.e(12, this.tYJ);
      }
      GMTrace.o(3899427651584L, 29053);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tPV);
      paramInt = i;
      if (this.uVR != null) {
        paramInt = i + b.a.a.a.fj(3, this.uVR.aYq());
      }
      i = paramInt;
      if (this.tPW != null) {
        i = paramInt + b.a.a.a.fj(4, this.tPW.aYq());
      }
      paramInt = i;
      if (this.tPX != null) {
        paramInt = i + b.a.a.a.fj(5, this.tPX.aYq());
      }
      i = paramInt + b.a.a.a.fh(6, this.tRC) + b.a.a.a.fh(7, this.tRD) + b.a.a.a.fh(8, this.tRE) + b.a.a.a.fh(9, this.nFd) + b.a.a.a.S(10, this.tQd);
      paramInt = i;
      if (this.tYF != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.tYF);
      }
      i = paramInt;
      if (this.tYJ != null) {
        i = paramInt + b.a.a.b.b.a.f(12, this.tYJ);
      }
      GMTrace.o(3899427651584L, 29053);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uVR == null) {
        throw new b("Not all required fields were included: ClientImgId");
      }
      if (this.tPW == null) {
        throw new b("Not all required fields were included: FromUserName");
      }
      if (this.tPX == null) {
        throw new b("Not all required fields were included: ToUserName");
      }
      GMTrace.o(3899427651584L, 29053);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bmb localbmb = (bmb)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3899427651584L, 29053);
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
          localbmb.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3899427651584L, 29053);
        return 0;
      case 2: 
        localbmb.tPV = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3899427651584L, 29053);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbmb.uVR = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3899427651584L, 29053);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbmb.tPW = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3899427651584L, 29053);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbmb.tPX = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3899427651584L, 29053);
        return 0;
      case 6: 
        localbmb.tRC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3899427651584L, 29053);
        return 0;
      case 7: 
        localbmb.tRD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3899427651584L, 29053);
        return 0;
      case 8: 
        localbmb.tRE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3899427651584L, 29053);
        return 0;
      case 9: 
        localbmb.nFd = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3899427651584L, 29053);
        return 0;
      case 10: 
        localbmb.tQd = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3899427651584L, 29053);
        return 0;
      case 11: 
        localbmb.tYF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3899427651584L, 29053);
        return 0;
      }
      localbmb.tYJ = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3899427651584L, 29053);
      return 0;
    }
    GMTrace.o(3899427651584L, 29053);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bmb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */