package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class lx
  extends azh
{
  public bue ucB;
  public boolean ucC;
  public String ucD;
  public String ucE;
  public boolean ucF;
  public String ucG;
  public String ucH;
  
  public lx()
  {
    GMTrace.i(3747493183488L, 27921);
    GMTrace.o(3747493183488L, 27921);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3747627401216L, 27922);
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
      if (this.ucB != null)
      {
        paramVarArgs.fm(2, this.ucB.aYq());
        this.ucB.a(paramVarArgs);
      }
      paramVarArgs.ah(3, this.ucC);
      if (this.ucD != null) {
        paramVarArgs.e(4, this.ucD);
      }
      if (this.ucE != null) {
        paramVarArgs.e(5, this.ucE);
      }
      paramVarArgs.ah(6, this.ucF);
      if (this.ucG != null) {
        paramVarArgs.e(7, this.ucG);
      }
      if (this.ucH != null) {
        paramVarArgs.e(8, this.ucH);
      }
      GMTrace.o(3747627401216L, 27922);
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
      if (this.ucB != null) {
        i = paramInt + b.a.a.a.fj(2, this.ucB.aYq());
      }
      i += b.a.a.b.b.a.cK(3) + 1;
      paramInt = i;
      if (this.ucD != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.ucD);
      }
      i = paramInt;
      if (this.ucE != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.ucE);
      }
      i += b.a.a.b.b.a.cK(6) + 1;
      paramInt = i;
      if (this.ucG != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.ucG);
      }
      i = paramInt;
      if (this.ucH != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.ucH);
      }
      GMTrace.o(3747627401216L, 27922);
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
      GMTrace.o(3747627401216L, 27922);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      lx locallx = (lx)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3747627401216L, 27922);
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
          locallx.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3747627401216L, 27922);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bue();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bue)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          locallx.ucB = ((bue)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3747627401216L, 27922);
        return 0;
      case 3: 
        locallx.ucC = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(3747627401216L, 27922);
        return 0;
      case 4: 
        locallx.ucD = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3747627401216L, 27922);
        return 0;
      case 5: 
        locallx.ucE = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3747627401216L, 27922);
        return 0;
      case 6: 
        locallx.ucF = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(3747627401216L, 27922);
        return 0;
      case 7: 
        locallx.ucG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3747627401216L, 27922);
        return 0;
      }
      locallx.ucH = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3747627401216L, 27922);
      return 0;
    }
    GMTrace.o(3747627401216L, 27922);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\lx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */