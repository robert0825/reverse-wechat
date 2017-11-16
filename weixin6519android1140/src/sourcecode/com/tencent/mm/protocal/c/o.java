package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class o
  extends azh
{
  public String eRf;
  public int jWs;
  public String jWt;
  public String mJK;
  public String omt;
  public String tMb;
  public a tMt;
  public String tMu;
  
  public o()
  {
    GMTrace.i(3859430768640L, 28755);
    this.jWs = 268513600;
    this.jWt = "请求不成功，请稍候再试";
    GMTrace.o(3859430768640L, 28755);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3859564986368L, 28756);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.jWs);
      if (this.jWt != null) {
        paramVarArgs.e(3, this.jWt);
      }
      if (this.mJK != null) {
        paramVarArgs.e(4, this.mJK);
      }
      if (this.eRf != null) {
        paramVarArgs.e(5, this.eRf);
      }
      if (this.omt != null) {
        paramVarArgs.e(7, this.omt);
      }
      if (this.tMb != null) {
        paramVarArgs.e(8, this.tMb);
      }
      if (this.tMt != null)
      {
        paramVarArgs.fm(9, this.tMt.aYq());
        this.tMt.a(paramVarArgs);
      }
      if (this.tMu != null) {
        paramVarArgs.e(10, this.tMu);
      }
      GMTrace.o(3859564986368L, 28756);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jWs);
      paramInt = i;
      if (this.jWt != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.jWt);
      }
      i = paramInt;
      if (this.mJK != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.mJK);
      }
      paramInt = i;
      if (this.eRf != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.eRf);
      }
      i = paramInt;
      if (this.omt != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.omt);
      }
      paramInt = i;
      if (this.tMb != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.tMb);
      }
      i = paramInt;
      if (this.tMt != null) {
        i = paramInt + b.a.a.a.fj(9, this.tMt.aYq());
      }
      paramInt = i;
      if (this.tMu != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.tMu);
      }
      GMTrace.o(3859564986368L, 28756);
      return paramInt;
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
      GMTrace.o(3859564986368L, 28756);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      o localo = (o)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 6: 
      default: 
        GMTrace.o(3859564986368L, 28756);
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
          localo.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3859564986368L, 28756);
        return 0;
      case 2: 
        localo.jWs = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3859564986368L, 28756);
        return 0;
      case 3: 
        localo.jWt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3859564986368L, 28756);
        return 0;
      case 4: 
        localo.mJK = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3859564986368L, 28756);
        return 0;
      case 5: 
        localo.eRf = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3859564986368L, 28756);
        return 0;
      case 7: 
        localo.omt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3859564986368L, 28756);
        return 0;
      case 8: 
        localo.tMb = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3859564986368L, 28756);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new a();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((a)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localo.tMt = ((a)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3859564986368L, 28756);
        return 0;
      }
      localo.tMu = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3859564986368L, 28756);
      return 0;
    }
    GMTrace.o(3859564986368L, 28756);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */