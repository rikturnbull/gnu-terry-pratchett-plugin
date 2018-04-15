package org.jenkins.ci.plugins.gnu_terry_pratchett;

import hudson.Extension;
import hudson.model.PageDecorator;
import net.sf.json.JSONObject;

import org.kohsuke.stapler.StaplerRequest;

@Extension
public final class GNUTerryPratchettPageDecorator extends PageDecorator
{
  private boolean sendHeader;

  public GNUTerryPratchettPageDecorator() {
    this(true);
  }

  public GNUTerryPratchettPageDecorator(final boolean sendHeader) {
    super();
    this.sendHeader = sendHeader;
    load();
  }

  @Override
  public String getDisplayName() {
    return Messages.displayName();
  }

  @Override
  public boolean configure(final StaplerRequest request, final JSONObject json) throws FormException {
    request.bindJSON(this, json);
    save();
    return true;
  }

  public boolean isSendHeader() {
    return sendHeader;
  }

  public void setSendHeader(final boolean sendHeader) {
    this.sendHeader = sendHeader;
  }
}
