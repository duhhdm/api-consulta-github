package br.com.apiconsultagithub.model;

import java.io.Serializable;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ItemModel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("id")
    private String id;
    
	@JsonProperty("node_id")
	private String nodeId;
 
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("full_name")
    private String fullName;
    
    @JsonProperty("private")
    private Boolean privates;
    
    @JsonProperty("owner")
    private OwnerModel owner;
    
    @JsonProperty("html_url")
    private String htmlUrl;
    
    @JsonProperty("description")
    private String description;
    
    @JsonProperty("fork")
    private String fork;
    
    @JsonProperty("url")
    private String url;
    
    @JsonProperty("forks_url")
    private String forksUrl;
    
    @JsonProperty("keys_url")
    private String keysUrl;
    
    @JsonProperty("collaborators_url")
    private String collaboratorsUrl;
    
    @JsonProperty("teams_url")
    private String teamsUrl;
    
    @JsonProperty("hooks_url")
    private String hooksUrl;
    
    @JsonProperty("issue_events_url")
    private String issueEventsUrl;
    
    @JsonProperty("events_url")
    private String eventsUrl;
    
    @JsonProperty("assignees_url")
    private String assigneesUrl;
    
    @JsonProperty("branches_url")
    private String branchesUrl;
    
    @JsonProperty("tags_url")
    private String tagsUrl;
    
    @JsonProperty("blobs_url")
    private String blobsUrl;
    
    @JsonProperty("git_tags_url")
    private String gitTagsUrl;
    
    @JsonProperty("git_refs_url")
    private String gitRefsUrl;
    
    @JsonProperty("trees_url")
    private String treesUrl;
    
    @JsonProperty("statuses_url")
    private String statusesUrl;
    
    @JsonProperty("languages_url")
    private String languagesUrl;
    
    @JsonProperty("stargazers_url")
    private String stargazersUrl;
    
    @JsonProperty("contributors_url")
    private String contributorsUrl;
    
    @JsonProperty("subscribers_url")
    private String subscribersUrl;
    
    @JsonProperty("subscription_url")
    private String subscriptionUrl;
    
    @JsonProperty("commits_url")
    private String commitsUrl;
    
    @JsonProperty("git_commits_url")
    private String gitCommitsUrl;
    
    @JsonProperty("comments_url")
    private String commentsUrl;
    
    @JsonProperty("issue_comment_url")
    private String issueCommentUrl;
    
    @JsonProperty("contents_url")
    private String contentsUrl;
    
    @JsonProperty("compare_url")
    private String compareUrl;
    
    @JsonProperty("merges_url")
    private String mergesUrl;
    
    @JsonProperty("archive_url")
    private String archiveUrl;
    
    @JsonProperty("downloads_url")
    private String downloadsUrl;
    
    @JsonProperty("issues_url")
    private String issuesUrl;
    
    @JsonProperty("pulls_url")
    private String pullsUrl;
    
    @JsonProperty("milestones_url")
    private String milestonesUrl;
    
    @JsonProperty("notifications_url")
    private String notificationsUrl;
    
    @JsonProperty("labels_url")
    private String labelsUrl;
    
    @JsonProperty("releases_url")
    private String releasesUrl;
    
    @JsonProperty("deployments_url")
    private String deploymentsUrl;
    
    @JsonProperty("created_at")
    private Timestamp createdAt;
    
    @JsonProperty("updated_at")
    private Timestamp updatedAt;
    
    @JsonProperty("pushed_at")
    private Timestamp pushedAt;
    
    @JsonProperty("git_url")
    private String gitUrl;
    
    @JsonProperty("ssh_url")
    private String ssh_url;
    
    @JsonProperty("clone_url")
    private String cloneUrl;
    
    @JsonProperty("svn_url")
    private String svnUrl;
    
    @JsonProperty("homepage")
    private String homepage;
    
    @JsonProperty("size")
    private Integer size;
    
    @JsonProperty("stargazers_count")
    private Integer stargazersCount;
    
    @JsonProperty("watchers_count")
    private Integer watchersCount;
    
    @JsonProperty("language")
    private String language;
    
    @JsonProperty("has_issues")
    private Boolean hasIssues;
    
    @JsonProperty("has_projects")
    private Boolean hasProjects;
    
    @JsonProperty("has_downloads")
    private Boolean hasDownloads;
    
    @JsonProperty("has_wiki")
    private Boolean hasWiki;
    
    @JsonProperty("has_pages")
    private Boolean hasPages;
    
    @JsonProperty("forks_count")
    private Integer forksCount;
    
    @JsonProperty("mirror_url")
    private String mirrorUrl;
    
    @JsonProperty("archived")
    private Boolean archived;
    
    @JsonProperty("disabled")
    private Boolean disabled;
    
    @JsonProperty("open_issues_count")
    private Integer openIssuesCount;
    
    @JsonProperty("license")
    private LicenseModel license;
    
    @JsonProperty("forks")
    private Integer forks;
    
    @JsonProperty("open_issues")
    private Integer openIssues;
    
    @JsonProperty("watchers")
    private Integer watchers;
    
    @JsonProperty("default_branch")
    private String defaultBranch;
    
    @JsonProperty("score")
    private String score;
    
    
    public ItemModel() {
    	
    }
}
