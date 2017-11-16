package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class wf
  extends azh
{
  public String tRV;
  public String tRX;
  public arh uoB;
  public int uoC;
  
  public wf()
  {
    GMTrace.i(3760109649920L, 28015);
    GMTrace.o(3760109649920L, 28015);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3760243867648L, 28016);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uoB == null) {
        throw new b("Not all required fields were included: AppInfo");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.uoB != null)
      {
        paramVarArgs.fm(2, this.uoB.aYq());
        this.uoB.a(paramVarArgs);
      }
      paramVarArgs.fk(3, this.uoC);
      if (this.tRX != null) {
        paramVarArgs.e(4, this.tRX);
      }
      if (this.tRV != null) {
        paramVarArgs.e(5, this.tRV);
      }
      GMTrace.o(3760243867648L, 28016);
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
      if (this.uoB != null) {
        i = paramInt + b.a.a.a.fj(2, this.uoB.aYq());
      }
      i += b.a.a.a.fh(3, this.uoC);
      paramInt = i;
      if (this.tRX != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tRX);
      }
      i = paramInt;
      if (this.tRV != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tRV);
      }
      GMTrace.o(3760243867648L, 28016);
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
      if (this.uoB == null) {
        throw new b("Not all required fields were included: AppInfo");
      }
      GMTrace.o(3760243867648L, 28016);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      wf localwf = (wf)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3760243867648L, 28016);
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
          localwf.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3760243867648L, 28016);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new arh();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((arh)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localwf.uoB = ((arh)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3760243867648L, 28016);
        return 0;
      case 3: 
        localwf.uoC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3760243867648L, 28016);
        return 0;
      case 4: 
        localwf.tRX = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3760243867648L, 28016);
        return 0;
      }
      localwf.tRV = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3760243867648L, 28016);
      return 0;
    }
    GMTrace.o(3760243867648L, 28016);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\wf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */