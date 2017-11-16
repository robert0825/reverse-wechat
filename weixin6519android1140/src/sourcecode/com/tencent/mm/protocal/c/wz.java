package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class wz
  extends azh
{
  public int jWs;
  public String jWt;
  public LinkedList<String> uoO;
  public String uoP;
  
  public wz()
  {
    GMTrace.i(3776215777280L, 28135);
    this.uoO = new LinkedList();
    GMTrace.o(3776215777280L, 28135);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3776349995008L, 28136);
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
      paramVarArgs.d(2, 1, this.uoO);
      paramVarArgs.fk(3, this.jWs);
      if (this.jWt != null) {
        paramVarArgs.e(4, this.jWt);
      }
      if (this.uoP != null) {
        paramVarArgs.e(5, this.uoP);
      }
      GMTrace.o(3776349995008L, 28136);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.c(2, 1, this.uoO) + b.a.a.a.fh(3, this.jWs);
      paramInt = i;
      if (this.jWt != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.jWt);
      }
      i = paramInt;
      if (this.uoP != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.uoP);
      }
      GMTrace.o(3776349995008L, 28136);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uoO.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3776349995008L, 28136);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      wz localwz = (wz)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3776349995008L, 28136);
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
          localwz.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3776349995008L, 28136);
        return 0;
      case 2: 
        localwz.uoO.add(((b.a.a.a.a)localObject1).yqV.readString());
        GMTrace.o(3776349995008L, 28136);
        return 0;
      case 3: 
        localwz.jWs = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3776349995008L, 28136);
        return 0;
      case 4: 
        localwz.jWt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3776349995008L, 28136);
        return 0;
      }
      localwz.uoP = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3776349995008L, 28136);
      return 0;
    }
    GMTrace.o(3776349995008L, 28136);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\wz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */