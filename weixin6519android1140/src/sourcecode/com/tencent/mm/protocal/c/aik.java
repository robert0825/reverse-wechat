package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aik
  extends ayx
{
  public String ufb;
  public String uxN;
  public LinkedList<String> uxO;
  
  public aik()
  {
    GMTrace.i(3690584866816L, 27497);
    this.uxO = new LinkedList();
    GMTrace.o(3690584866816L, 27497);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3690719084544L, 27498);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ufb == null) {
        throw new b("Not all required fields were included: corp_id");
      }
      if (this.uxN == null) {
        throw new b("Not all required fields were included: bizchat_name");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.ufb != null) {
        paramVarArgs.e(2, this.ufb);
      }
      if (this.uxN != null) {
        paramVarArgs.e(3, this.uxN);
      }
      paramVarArgs.d(4, 1, this.uxO);
      GMTrace.o(3690719084544L, 27498);
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
      if (this.ufb != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.ufb);
      }
      i = paramInt;
      if (this.uxN != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uxN);
      }
      paramInt = b.a.a.a.c(4, 1, this.uxO);
      GMTrace.o(3690719084544L, 27498);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uxO.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.ufb == null) {
        throw new b("Not all required fields were included: corp_id");
      }
      if (this.uxN == null) {
        throw new b("Not all required fields were included: bizchat_name");
      }
      GMTrace.o(3690719084544L, 27498);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aik localaik = (aik)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3690719084544L, 27498);
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
          localaik.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3690719084544L, 27498);
        return 0;
      case 2: 
        localaik.ufb = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3690719084544L, 27498);
        return 0;
      case 3: 
        localaik.uxN = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3690719084544L, 27498);
        return 0;
      }
      localaik.uxO.add(((b.a.a.a.a)localObject1).yqV.readString());
      GMTrace.o(3690719084544L, 27498);
      return 0;
    }
    GMTrace.o(3690719084544L, 27498);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aik.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */