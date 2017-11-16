package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bcf
  extends ayx
{
  public String nIp;
  public int tOG;
  public int uOW;
  public alk ufs;
  
  public bcf()
  {
    GMTrace.i(3634347638784L, 27078);
    GMTrace.o(3634347638784L, 27078);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3634481856512L, 27079);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ufs == null) {
        throw new b("Not all required fields were included: Loc");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.ufs != null)
      {
        paramVarArgs.fm(2, this.ufs.aYq());
        this.ufs.a(paramVarArgs);
      }
      paramVarArgs.fk(3, this.uOW);
      paramVarArgs.fk(4, this.tOG);
      if (this.nIp != null) {
        paramVarArgs.e(5, this.nIp);
      }
      GMTrace.o(3634481856512L, 27079);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt;
      if (this.ufs != null) {
        i = paramInt + b.a.a.a.fj(2, this.ufs.aYq());
      }
      i = i + b.a.a.a.fh(3, this.uOW) + b.a.a.a.fh(4, this.tOG);
      paramInt = i;
      if (this.nIp != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.nIp);
      }
      GMTrace.o(3634481856512L, 27079);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.ufs == null) {
        throw new b("Not all required fields were included: Loc");
      }
      GMTrace.o(3634481856512L, 27079);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bcf localbcf = (bcf)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3634481856512L, 27079);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbcf.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3634481856512L, 27079);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new alk();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((alk)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbcf.ufs = ((alk)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3634481856512L, 27079);
        return 0;
      case 3: 
        localbcf.uOW = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3634481856512L, 27079);
        return 0;
      case 4: 
        localbcf.tOG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3634481856512L, 27079);
        return 0;
      }
      localbcf.nIp = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3634481856512L, 27079);
      return 0;
    }
    GMTrace.o(3634481856512L, 27079);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bcf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */