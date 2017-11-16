package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class li
  extends azh
{
  public int jWs;
  public String jWt;
  public String ojE;
  public String ojF;
  public String ojG;
  public String tRL;
  
  public li()
  {
    GMTrace.i(20859582414848L, 155416);
    GMTrace.o(20859582414848L, 155416);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20859716632576L, 155417);
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
      if (this.ojE != null) {
        paramVarArgs.e(4, this.ojE);
      }
      if (this.ojF != null) {
        paramVarArgs.e(5, this.ojF);
      }
      if (this.ojG != null) {
        paramVarArgs.e(6, this.ojG);
      }
      if (this.tRL != null) {
        paramVarArgs.e(7, this.tRL);
      }
      GMTrace.o(20859716632576L, 155417);
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
      if (this.ojE != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.ojE);
      }
      paramInt = i;
      if (this.ojF != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.ojF);
      }
      i = paramInt;
      if (this.ojG != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.ojG);
      }
      paramInt = i;
      if (this.tRL != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.tRL);
      }
      GMTrace.o(20859716632576L, 155417);
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
      GMTrace.o(20859716632576L, 155417);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      li localli = (li)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(20859716632576L, 155417);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localli.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(20859716632576L, 155417);
        return 0;
      case 2: 
        localli.jWs = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(20859716632576L, 155417);
        return 0;
      case 3: 
        localli.jWt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20859716632576L, 155417);
        return 0;
      case 4: 
        localli.ojE = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20859716632576L, 155417);
        return 0;
      case 5: 
        localli.ojF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20859716632576L, 155417);
        return 0;
      case 6: 
        localli.ojG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20859716632576L, 155417);
        return 0;
      }
      localli.tRL = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(20859716632576L, 155417);
      return 0;
    }
    GMTrace.o(20859716632576L, 155417);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\li.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */