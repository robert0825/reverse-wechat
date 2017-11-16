package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class adl
  extends ayx
{
  public String code;
  public String eTJ;
  public String jxF;
  public int scene;
  
  public adl()
  {
    GMTrace.i(4021968437248L, 29966);
    GMTrace.o(4021968437248L, 29966);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4022102654976L, 29967);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.eTJ != null) {
        paramVarArgs.e(2, this.eTJ);
      }
      paramVarArgs.fk(3, this.scene);
      if (this.jxF != null) {
        paramVarArgs.e(4, this.jxF);
      }
      if (this.code != null) {
        paramVarArgs.e(5, this.code);
      }
      GMTrace.o(4022102654976L, 29967);
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
      if (this.eTJ != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.eTJ);
      }
      i += b.a.a.a.fh(3, this.scene);
      paramInt = i;
      if (this.jxF != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.jxF);
      }
      i = paramInt;
      if (this.code != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.code);
      }
      GMTrace.o(4022102654976L, 29967);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(4022102654976L, 29967);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      adl localadl = (adl)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(4022102654976L, 29967);
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
          localadl.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4022102654976L, 29967);
        return 0;
      case 2: 
        localadl.eTJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4022102654976L, 29967);
        return 0;
      case 3: 
        localadl.scene = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4022102654976L, 29967);
        return 0;
      case 4: 
        localadl.jxF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4022102654976L, 29967);
        return 0;
      }
      localadl.code = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(4022102654976L, 29967);
      return 0;
    }
    GMTrace.o(4022102654976L, 29967);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\adl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */