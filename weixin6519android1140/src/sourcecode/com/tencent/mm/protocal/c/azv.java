package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class azv
  extends ayx
{
  public int cfz;
  public String eSd;
  public String uuj;
  
  public azv()
  {
    GMTrace.i(14997220491264L, 111738);
    GMTrace.o(14997220491264L, 111738);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14997354708992L, 111739);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.eSd != null) {
        paramVarArgs.e(2, this.eSd);
      }
      if (this.uuj != null) {
        paramVarArgs.e(3, this.uuj);
      }
      paramVarArgs.fk(4, this.cfz);
      GMTrace.o(14997354708992L, 111739);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.eSd != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.eSd);
      }
      i = paramInt;
      if (this.uuj != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uuj);
      }
      paramInt = b.a.a.a.fh(4, this.cfz);
      GMTrace.o(14997354708992L, 111739);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(14997354708992L, 111739);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      azv localazv = (azv)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(14997354708992L, 111739);
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
          localazv.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(14997354708992L, 111739);
        return 0;
      case 2: 
        localazv.eSd = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(14997354708992L, 111739);
        return 0;
      case 3: 
        localazv.uuj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(14997354708992L, 111739);
        return 0;
      }
      localazv.cfz = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(14997354708992L, 111739);
      return 0;
    }
    GMTrace.o(14997354708992L, 111739);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\azv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */