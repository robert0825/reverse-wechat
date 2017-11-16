package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class akg
  extends ayx
{
  public String lPM;
  
  public akg()
  {
    GMTrace.i(3987742916608L, 29711);
    GMTrace.o(3987742916608L, 29711);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3987877134336L, 29712);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lPM == null) {
        throw new b("Not all required fields were included: Url");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.lPM != null) {
        paramVarArgs.e(2, this.lPM);
      }
      GMTrace.o(3987877134336L, 29712);
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
      if (this.lPM != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.lPM);
      }
      GMTrace.o(3987877134336L, 29712);
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
      if (this.lPM == null) {
        throw new b("Not all required fields were included: Url");
      }
      GMTrace.o(3987877134336L, 29712);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      akg localakg = (akg)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3987877134336L, 29712);
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
          localakg.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3987877134336L, 29712);
        return 0;
      }
      localakg.lPM = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3987877134336L, 29712);
      return 0;
    }
    GMTrace.o(3987877134336L, 29712);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\akg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */