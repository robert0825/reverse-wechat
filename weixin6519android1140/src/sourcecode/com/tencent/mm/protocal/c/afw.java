package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class afw
  extends ayx
{
  public String eSd;
  public int tWS;
  public int type;
  public String uvw;
  public int uvx;
  public int uvy;
  
  public afw()
  {
    GMTrace.i(15350481551360L, 114370);
    GMTrace.o(15350481551360L, 114370);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15350615769088L, 114371);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.type);
      if (this.eSd != null) {
        paramVarArgs.e(3, this.eSd);
      }
      paramVarArgs.fk(4, this.tWS);
      if (this.uvw != null) {
        paramVarArgs.e(5, this.uvw);
      }
      paramVarArgs.fk(6, this.uvx);
      paramVarArgs.fk(7, this.uvy);
      GMTrace.o(15350615769088L, 114371);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.type);
      paramInt = i;
      if (this.eSd != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.eSd);
      }
      i = paramInt + b.a.a.a.fh(4, this.tWS);
      paramInt = i;
      if (this.uvw != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.uvw);
      }
      i = b.a.a.a.fh(6, this.uvx);
      int j = b.a.a.a.fh(7, this.uvy);
      GMTrace.o(15350615769088L, 114371);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(15350615769088L, 114371);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      afw localafw = (afw)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(15350615769088L, 114371);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localafw.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15350615769088L, 114371);
        return 0;
      case 2: 
        localafw.type = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(15350615769088L, 114371);
        return 0;
      case 3: 
        localafw.eSd = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(15350615769088L, 114371);
        return 0;
      case 4: 
        localafw.tWS = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(15350615769088L, 114371);
        return 0;
      case 5: 
        localafw.uvw = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(15350615769088L, 114371);
        return 0;
      case 6: 
        localafw.uvx = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(15350615769088L, 114371);
        return 0;
      }
      localafw.uvy = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(15350615769088L, 114371);
      return 0;
    }
    GMTrace.o(15350615769088L, 114371);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\afw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */