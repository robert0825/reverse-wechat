package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ie
  extends ayx
{
  public String omK;
  public String tXc;
  public String tXd;
  public int tXe;
  public String tXg;
  
  public ie()
  {
    GMTrace.i(19142132367360L, 142620);
    GMTrace.o(19142132367360L, 142620);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19142266585088L, 142621);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tXc == null) {
        throw new b("Not all required fields were included: f2f_id");
      }
      if (this.tXd == null) {
        throw new b("Not all required fields were included: trans_id");
      }
      if (this.omK == null) {
        throw new b("Not all required fields were included: receiver_openid");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.tXc != null) {
        paramVarArgs.e(2, this.tXc);
      }
      if (this.tXd != null) {
        paramVarArgs.e(3, this.tXd);
      }
      if (this.omK != null) {
        paramVarArgs.e(4, this.omK);
      }
      paramVarArgs.fk(5, this.tXe);
      if (this.tXg != null) {
        paramVarArgs.e(6, this.tXg);
      }
      GMTrace.o(19142266585088L, 142621);
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
      if (this.tXc != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tXc);
      }
      i = paramInt;
      if (this.tXd != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tXd);
      }
      paramInt = i;
      if (this.omK != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.omK);
      }
      i = paramInt + b.a.a.a.fh(5, this.tXe);
      paramInt = i;
      if (this.tXg != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tXg);
      }
      GMTrace.o(19142266585088L, 142621);
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
      if (this.tXc == null) {
        throw new b("Not all required fields were included: f2f_id");
      }
      if (this.tXd == null) {
        throw new b("Not all required fields were included: trans_id");
      }
      if (this.omK == null) {
        throw new b("Not all required fields were included: receiver_openid");
      }
      GMTrace.o(19142266585088L, 142621);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ie localie = (ie)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(19142266585088L, 142621);
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
          localie.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(19142266585088L, 142621);
        return 0;
      case 2: 
        localie.tXc = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19142266585088L, 142621);
        return 0;
      case 3: 
        localie.tXd = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19142266585088L, 142621);
        return 0;
      case 4: 
        localie.omK = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19142266585088L, 142621);
        return 0;
      case 5: 
        localie.tXe = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(19142266585088L, 142621);
        return 0;
      }
      localie.tXg = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(19142266585088L, 142621);
      return 0;
    }
    GMTrace.o(19142266585088L, 142621);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ie.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */