package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class alt
  extends ayx
{
  public int eSe;
  public String gjb;
  public String kJb;
  public String username;
  
  public alt()
  {
    GMTrace.i(3854330494976L, 28717);
    GMTrace.o(3854330494976L, 28717);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3854464712704L, 28718);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.username == null) {
        throw new b("Not all required fields were included: username");
      }
      if (this.kJb == null) {
        throw new b("Not all required fields were included: appusername");
      }
      if (this.gjb == null) {
        throw new b("Not all required fields were included: rankid");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.username != null) {
        paramVarArgs.e(2, this.username);
      }
      if (this.kJb != null) {
        paramVarArgs.e(3, this.kJb);
      }
      paramVarArgs.fk(4, this.eSe);
      if (this.gjb != null) {
        paramVarArgs.e(5, this.gjb);
      }
      GMTrace.o(3854464712704L, 28718);
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
      if (this.username != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.username);
      }
      i = paramInt;
      if (this.kJb != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.kJb);
      }
      i += b.a.a.a.fh(4, this.eSe);
      paramInt = i;
      if (this.gjb != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.gjb);
      }
      GMTrace.o(3854464712704L, 28718);
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
      if (this.username == null) {
        throw new b("Not all required fields were included: username");
      }
      if (this.kJb == null) {
        throw new b("Not all required fields were included: appusername");
      }
      if (this.gjb == null) {
        throw new b("Not all required fields were included: rankid");
      }
      GMTrace.o(3854464712704L, 28718);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      alt localalt = (alt)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3854464712704L, 28718);
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
          localalt.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3854464712704L, 28718);
        return 0;
      case 2: 
        localalt.username = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3854464712704L, 28718);
        return 0;
      case 3: 
        localalt.kJb = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3854464712704L, 28718);
        return 0;
      case 4: 
        localalt.eSe = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3854464712704L, 28718);
        return 0;
      }
      localalt.gjb = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3854464712704L, 28718);
      return 0;
    }
    GMTrace.o(3854464712704L, 28718);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\alt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */