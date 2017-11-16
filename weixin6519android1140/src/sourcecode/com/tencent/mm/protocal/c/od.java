package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class od
  extends ayx
{
  public String ufb;
  public String ufc;
  public String ufd;
  
  public od()
  {
    GMTrace.i(3823326199808L, 28486);
    GMTrace.o(3823326199808L, 28486);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3823460417536L, 28487);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ufb == null) {
        throw new b("Not all required fields were included: corp_id");
      }
      if (this.ufc == null) {
        throw new b("Not all required fields were included: qychat_type");
      }
      if (this.ufd == null) {
        throw new b("Not all required fields were included: qychat_id");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.ufb != null) {
        paramVarArgs.e(2, this.ufb);
      }
      if (this.ufc != null) {
        paramVarArgs.e(3, this.ufc);
      }
      if (this.ufd != null) {
        paramVarArgs.e(4, this.ufd);
      }
      GMTrace.o(3823460417536L, 28487);
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
      if (this.ufc != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.ufc);
      }
      paramInt = i;
      if (this.ufd != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.ufd);
      }
      GMTrace.o(3823460417536L, 28487);
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
      if (this.ufb == null) {
        throw new b("Not all required fields were included: corp_id");
      }
      if (this.ufc == null) {
        throw new b("Not all required fields were included: qychat_type");
      }
      if (this.ufd == null) {
        throw new b("Not all required fields were included: qychat_id");
      }
      GMTrace.o(3823460417536L, 28487);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      od localod = (od)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3823460417536L, 28487);
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
          localod.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3823460417536L, 28487);
        return 0;
      case 2: 
        localod.ufb = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3823460417536L, 28487);
        return 0;
      case 3: 
        localod.ufc = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3823460417536L, 28487);
        return 0;
      }
      localod.ufd = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3823460417536L, 28487);
      return 0;
    }
    GMTrace.o(3823460417536L, 28487);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\od.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */